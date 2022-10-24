package components

import org.springframework.stereotype.Component
import java.time.LocalDate
import java.util.*

@Component
class PaydaySimpleCalendar : SimpleCalendar {
    private val calendar: Calendar = Calendar.getInstance()

    override fun year(date: Date): Int {
        return genCalDatePart(date, Calendar.YEAR)
    }

    override fun month(date: Date): Int{
        return genCalDatePart(date, Calendar.MONTH)+1
    }

    override fun day(date: Date): Int{
        return genCalDatePart(date, Calendar.DATE)
    }

    override fun dayOfWeek(date: Date): Int{
        return genCalDatePart(date, Calendar.DAY_OF_WEEK)
    }

    override fun date(year: Int, month: Int, day: Int): Date {
        calendar[Calendar.YEAR] = year
        calendar[Calendar.MONTH] = month-1
        calendar[Calendar.DATE] = day
        return calendar.time
    }

    override fun currentDate(timezone: String): Date {
        val d: LocalDate = (Calendar.getInstance(TimeZone.getTimeZone(timezone)) as GregorianCalendar)
            .toZonedDateTime()
            .toLocalDate()
        return date(d.year, d.monthValue, d.dayOfMonth)
    }

    override fun addDays(date: Date, howMany: Int): Date {
        return add(date, Calendar.DATE, howMany)
    }

    override fun addMonths(date: Date, howMany: Int): Date {
        return add(date, Calendar.MONTH, howMany)
    }

    override fun addYears(date: Date, howMany: Int): Date {
        return add(date, Calendar.YEAR, howMany)
    }

    private fun add(date: Date, what: Int, howMany: Int): Date {
        calendar.time = date
        calendar.add(what, howMany)
        return calendar.time
    }

    private fun genCalDatePart(date: Date, part: Int): Int{
        calendar.time = date
        return calendar[part]
    }
}