package services.businessday

import components.SimpleCalendar
import org.springframework.stereotype.Component
import repositories.holiday.Country
import repositories.holiday.HolidayRepository
import java.util.*

@Component
class BusinessDayIdentifier(
    private val country: Country,
    private val repository: HolidayRepository,
    private val cal: SimpleCalendar
) {
    fun identifyBusinessDay(baseDate: Date): Int {
        val weekendDays: List<Int> = listOf(1, 7)
        val holidays: List<Date> = repository.getFrom(country, baseDate)
        var businessDay = 0
        if (!holidays.contains(baseDate) && !weekendDays.contains(cal.dayOfWeek(baseDate))) {
            businessDay++
            var d: Date = cal.date(cal.year(baseDate), cal.month(baseDate), 1)
            while (d < baseDate) {
                if (!holidays.contains(d) && !weekendDays.contains(cal.dayOfWeek(d))) {
                    businessDay++
                }
                d = cal.addDays(d, 1)
            }
        }
        return businessDay
    }
}