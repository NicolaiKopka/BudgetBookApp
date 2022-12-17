package com.github.NicolaiKopka.BudgetBookApp.api.conversion;

import com.NicolaiKopka.budgetbookapp.api.AddExpenseInformationPayload;
import com.github.NicolaiKopka.BudgetBookApp.domain.AddExpenseInformation;
import org.springframework.stereotype.Service;

@Service
public class PayloadToModelConverter {

    public AddExpenseInformation convert(final AddExpenseInformationPayload addExpenseInformationPayload) {
        return new AddExpenseInformation(addExpenseInformationPayload.getAmount(), addExpenseInformationPayload.getIntervalNumber(),
                addExpenseInformationPayload.getIntervalSpecification(), addExpenseInformationPayload.getDueDate());
    }
}
