package repositories.holiday.global

import components.SimpleCalendar
import entities.Holiday
import java.util.*

abstract class GlobalHolidayRepository(protected val cal: SimpleCalendar) {
    fun getMovableFeasts(year: Int) : List<Holiday>{
        val easter: Date = calculateEaster(year)
        return listOf(
            calculateGoodFriday(easter),
            calculateCarnival(easter),
            calculateAshWednesday(easter),
            calculateCorpusChristi(easter),
        )
    }

    private fun calculateEaster(year: Int): Date {
        val a: Int = year % 19
        val b: Int = year % 4
        val c:Int = year % 7
        val p: Int = year/100
        val q: Int = (13 + 8 * p) / 25
        val m: Int = (15 - q + p - p / 4) % 30
        val n: Int = (4 + p - p / 4) % 7
        val d: Int = (19 * a + m) % 30
        val e: Int = (2 * b + 4 * c + 6 * d + n) % 7
        val days: Int = 22 + d + e
        if (d == 29 && e == 6){
            return cal.date(year, 4, 19)
        } else if(d == 28 && e == 6) {
            return cal.date(year, 4, 18)
        } else {
            return cal.addDays(cal.date(year, 3, 1), days-1)
        }
    }

    private fun calculateGoodFriday(easter: Date): Holiday{
        return makeHoliday(cal.addDays(easter, -2))
    }

    private fun calculateCarnival(easter: Date): Holiday{
        return makeHoliday(cal.addDays(easter, -47))
    }

    private fun calculateAshWednesday(easter: Date): Holiday{
        val carnival: Holiday = calculateCarnival(easter)
        return makeHoliday(
            cal.addDays(
                cal.date(
                    cal.year(easter),
                    carnival.month,
                    carnival.day
                ), 1
            )
        )
    }

    private fun calculateCorpusChristi(easter: Date): Holiday{
        return makeHoliday(cal.addDays(easter, 60))
    }

    private fun makeHoliday(date: Date): Holiday{
        return Holiday(cal.month(date), cal.day(date))
    }
}