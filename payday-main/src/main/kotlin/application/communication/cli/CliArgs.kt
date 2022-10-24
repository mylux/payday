package application.communication.cli

import usecases.enums.Operation
import net.sourceforge.argparse4j.ArgumentParsers
import net.sourceforge.argparse4j.inf.ArgumentParser
import net.sourceforge.argparse4j.inf.Subparser
import net.sourceforge.argparse4j.inf.Subparsers

class CliArgs {
    companion object {
        fun parse(args: Array<String>): Map<String, String> {
            val parser: ArgumentParser = ArgumentParsers.newFor("payday")
                .build()
                .defaultHelp(true)
                .description("Determine when its a specific business day")
            parser.addArgument("--country", "-c")
                .help("Country code: br=Brazil, co=Colombia, mx=Mexico")
                .type(String::class.java)
                .required(true)
            val subparsers: Subparsers = parser.addSubparsers().help("Operation to invoke")

            val nthBusinessDay: Subparser =
                subparsers.addParser(Operation.DETERMINE_NTH_BUSINESS_DAY.operation)
                    .help("Returns what business day is a given date")
                    .setDefault("operation", Operation.DETERMINE_NTH_BUSINESS_DAY.operation)
                    .aliases("det")
            nthBusinessDay.addArgument("timestamp").help("The date to identity the business day").required(true)

            val isBusinessDay: Subparser = subparsers.addParser(Operation.IS_NTH_BUSINESS_DAY.operation)
                .help("Given a date d and an ordinal number n, returns whether the date d is the nth business day")
                .setDefault("operation", Operation.IS_NTH_BUSINESS_DAY.operation)
                .aliases("is")
            isBusinessDay.addArgument("timestamp").help("The date to identify the nth business day").required(true)
            isBusinessDay.addArgument("ordinal").type(Int::class.java).required(true)
                .help("The ordinal number. First=1, second=2, third=3 and so on")

            val today: Subparser = subparsers.addParser(Operation.IS_TODAY_NTH_BUSINESS_DAY.operation)
                .help("Given an ordinal business day number and a timezone, returns whether today is the nth business day")
                .setDefault("operation", Operation.IS_TODAY_NTH_BUSINESS_DAY.operation)
                .aliases("today")
            today.addArgument("ordinal").type(Int::class.java).required(true)
                .help("The ordinal number. First=1, second=2, third=3 and so on")
            today.addArgument("timezone").help("the timezone to use when querying the current date").required(true)

            return parser.parseArgsOrFail(args).attrs.map { it.key to it.value.toString() }.toMap()
        }
    }
}