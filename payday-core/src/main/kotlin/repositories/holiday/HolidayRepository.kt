package repositories.holiday

import java.util.*

interface HolidayRepository {
    fun getAll(country: Country, year: Int): List<Date>
    fun getFrom(country: Country, date: Date): List<Date>
}