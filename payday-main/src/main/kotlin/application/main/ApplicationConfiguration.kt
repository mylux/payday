package application.main

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import repositories.holiday.Country
import services.output.OutputProvider
import services.output.ReturnOutputProvider
import services.output.StdoutOutputProvider
import usecases.DetermineNthBusinessDay
import usecases.IsNthBusinessDay
import usecases.IsTodayNthBusinessDay
import usecases.Usecase
import usecases.enums.Operation

@Configuration
class ApplicationConfiguration {
    //@Bean
    /*fun country(@Qualifier("applicationArgs") parsedArgs: Map<String, String>) =
        Country.getByCountryCode(parsedArgs["country"]!!)*/

    @Bean("selectedUsecase")
    fun useCase(
        operation: Operation,
        isTodayNthBusinessDay: IsTodayNthBusinessDay,
        determineNthBusinessDay: DetermineNthBusinessDay,
        isNthBusinessDay: IsNthBusinessDay
    ): Usecase {
        return when (operation) {
            Operation.IS_TODAY_NTH_BUSINESS_DAY -> isTodayNthBusinessDay
            Operation.DETERMINE_NTH_BUSINESS_DAY -> determineNthBusinessDay
            Operation.IS_NTH_BUSINESS_DAY -> isNthBusinessDay
        }
    }
}