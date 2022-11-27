package com.github.NicolaiKopka.BudgetBookApp.conversion

import com.NicolaiKopka.budgetbookapp.api.AddExpenseInformationPayload
import com.github.NicolaiKopka.BudgetBookApp.controller.conversion.PayloadToModelConverter
import com.github.NicolaiKopka.BudgetBookApp.domainDefinition.AddExpenseInformation
import spock.lang.Specification

class AddExpenseInformationPayloadConverterSpec extends Specification {

    def 'converts an AddExpenseInformationPayload'() {
        given: 'an AddExpenseInformationPayload'
        def amount = new BigDecimal(100.15)
        def intervalNumber = 1
        def intervalSpecification = 'monthly'
        def dueDate = 12345L
        AddExpenseInformationPayload addExpenseInformationPayload = new AddExpenseInformationPayload()
        addExpenseInformationPayload.amount(amount)
        addExpenseInformationPayload.intervalNumber(intervalNumber)
        addExpenseInformationPayload.intervalSpecification(intervalSpecification)
        addExpenseInformationPayload.dueDate(dueDate)

        and: 'a converter'
        PayloadToModelConverter underTest = new PayloadToModelConverter()

        when: 'converts'
        AddExpenseInformation addExpenseInformation = underTest.convert(addExpenseInformationPayload)

        then:
        addExpenseInformation.getAmount() == amount
        addExpenseInformation.getIntervalNumber() == intervalNumber
        addExpenseInformation.getIntervalSpecification() == intervalSpecification
        addExpenseInformation.getDueDate() == dueDate
    }
}
