package usecases.enums

enum class Operation(val operation: String) {
    DETERMINE_NTH_BUSINESS_DAY("determine-nth-business-day"),
    IS_NTH_BUSINESS_DAY("is-nth-business-day"),
    IS_TODAY_NTH_BUSINESS_DAY("is-today-nth-business-day");

    companion object {
        fun getByOperationName(operation: String) = Operation.values().first { it.operation == operation }
    }
}