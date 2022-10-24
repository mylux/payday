package usecases

import components.SimpleCalendar
import services.businessday.BusinessDayIdentifier
import services.output.OutputProvider
import usecases.enums.Operation

class UsecaseFactory {
    fun make(outputProvider: OutputProvider, identifier: BusinessDayIdentifier, operation: Operation, calendar: SimpleCalendar): Usecase{
        return when(operation){
            Operation.IS_TODAY_NTH_BUSINESS_DAY -> IsTodayNthBusinessDay(outputProvider, identifier, calendar)
            Operation.DETERMINE_NTH_BUSINESS_DAY -> DetermineNthBusinessDay(outputProvider, identifier, calendar)
            Operation.IS_NTH_BUSINESS_DAY -> IsNthBusinessDay(outputProvider, identifier, calendar)
        }
    }
}