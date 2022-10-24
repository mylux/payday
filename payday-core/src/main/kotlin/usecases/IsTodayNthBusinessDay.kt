package usecases

import components.SimpleCalendar
import entities.Output
import org.springframework.stereotype.Component
import repositories.holiday.Country
import services.businessday.BusinessDayIdentifier
import services.output.OutputProvider

@Component
class IsTodayNthBusinessDay(
    private val outputProvider: OutputProvider,
    private val identifier: BusinessDayIdentifier,
    private val cal: SimpleCalendar
    ) : Usecase {
    override fun run(params: Map<String, String>): Output<*> {
        val ordinal: Int = Integer.parseInt(params["ordinal"])
        val tz: String = params["timezone"].toString()
        val date = cal.currentDate(tz)
        val country: Country = Country.getByCountryCode(params["country"]!!)
        val r = Output(identifier.identifyBusinessDay(country, date) == ordinal)
        return outputProvider.provide(r)
        /*val r = Output(true)
        return outputProvider.provide(r)*/
    }
}