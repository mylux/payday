package repositories.holiday

enum class Country(val code: String) {
    BRAZIL("br"), COLOMBIA("co");

    companion object{
        fun getByCountryCode(code: String): Country = Country.values().first { it.code ==  code}
    }
}