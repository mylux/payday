package repositories.holiday.localized

import org.springframework.stereotype.Component
import repositories.holiday.Country
import repositories.holiday.HolidayRepository
import java.util.*

@Component
class HolidayRepositoryStrategy(repositories: List<LocalizedHolidayRepository>): HolidayRepository {
    private val repoMap = repositories.associateBy { it.country() }
    override fun getAll(country: Country, year: Int): List<Date> {
        return repoMap[country]?.getAll(year)?:throw Exception("Country ${country.name} inexistent")
    }

    override fun getFrom(country: Country, date: Date): List<Date> {
        return repoMap[country]?.getFrom(date)?:throw Exception("Country ${country.name} inexistent")
    }
}