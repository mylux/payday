package repositories.holiday.localized.br

import components.SimpleCalendar
import entities.Holiday
import org.springframework.stereotype.Component
import repositories.holiday.Country
import repositories.holiday.global.GlobalHolidayRepository
import repositories.holiday.localized.LocalizedHolidayRepository
import java.util.*

@Component
class BrazilianHolidayRepository(cal: SimpleCalendar) : GlobalHolidayRepository(cal), LocalizedHolidayRepository {
    private val fixedFeasts: List<Holiday> = listOf(
        Holiday(1, 1),
        Holiday(4, 21),
        Holiday(5, 1),
        Holiday(9, 7),
        Holiday(10, 12),
        Holiday(11, 15),
        Holiday(11, 2),
        Holiday(12, 25)
    )

    override fun country(): Country = Country.BRAZIL

    override fun getAll(year: Int): List<Date> {
        return generateDateList(fixedFeasts + getMovableFeasts(year), year)
    }

    override fun getFrom(date: Date): List<Date> {
        val month: Int = cal.month(date)
        val year: Int = cal.year(date)
        return generateDateList ((fixedFeasts + getMovableFeasts(year)).filter { it.month == month }, year)
    }

    private fun generateDateList(allFeasts: List<Holiday>, year: Int) : List<Date>{
        return allFeasts.map {
            cal.date(year, it.month, it.day)
        }
    }
}