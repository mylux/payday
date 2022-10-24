package components

import java.util.*

interface SimpleCalendar {
    fun year(date: Date): Int
    fun month(date: Date): Int
    fun day(date: Date): Int
    fun dayOfWeek(date: Date): Int
    fun date(year: Int, month: Int, day: Int): Date
    fun currentDate(timezone: String): Date
    fun addDays(date: Date, howMany: Int): Date
    fun addMonths(date: Date, howMany: Int): Date
    fun addYears(date: Date, howMany: Int): Date
}