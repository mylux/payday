package repositories.holiday.localized

import repositories.holiday.Country
import java.util.*

interface LocalizedHolidayRepository {
    fun country(): Country
    fun getAll(year: Int): List<Date>
    fun getFrom(date: Date): List<Date>
}