package repositories.holiday.localized.co

import components.SimpleCalendar
import org.springframework.stereotype.Component
import repositories.holiday.Country
import repositories.holiday.localized.LocalizedHolidayRepository
import java.util.*

@Component
class ColombianHolidayRepository(private val calendar: SimpleCalendar): LocalizedHolidayRepository {
    override fun country(): Country = Country.COLOMBIA

    override fun getAll(year: Int): List<Date> {
        return listOf()
    }

    override fun getFrom(date: Date): List<Date> {
        return getAll(calendar.year(date))
    }
}