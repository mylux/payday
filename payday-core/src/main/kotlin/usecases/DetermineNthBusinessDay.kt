package usecases

import components.SimpleCalendar
import entities.Output
import org.springframework.stereotype.Component
import repositories.holiday.Country
import services.businessday.BusinessDayIdentifier
import services.output.OutputProvider
import java.text.SimpleDateFormat
import java.util.*

@Component
class DetermineNthBusinessDay(
    private val outputProvider: OutputProvider,
    private val identifier: BusinessDayIdentifier,
    private val cal: SimpleCalendar
    ) : Usecase {
    override fun run(params: Map<String, String>): Output<*> {
        val date: Date = SimpleDateFormat("yyyy-MM-dd").parse(params["timestamp"])
        val country: Country = Country.getByCountryCode(params["country"]!!)
        val r = Output("${identifier.identifyBusinessDay(country, date)}")
        return outputProvider.provide(r)
    }
}