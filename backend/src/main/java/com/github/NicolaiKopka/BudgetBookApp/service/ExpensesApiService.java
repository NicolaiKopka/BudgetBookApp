package com.github.NicolaiKopka.BudgetBookApp.service;

import com.NicolaiKopka.budgetbookapp.api.AddExpenseInformationPayload;
import com.github.NicolaiKopka.BudgetBookApp.conversion.PayloadToModelConverter;
import com.github.NicolaiKopka.BudgetBookApp.domainDefinition.AddExpenseInformation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExpensesApiService {

    final PayloadToModelConverter payloadToModelConverter;

    public void addNewExpense(final AddExpenseInformationPayload addExpenseInformationPayload) {
        final AddExpenseInformation addExpenseInformation = payloadToModelConverter.convert(addExpenseInformationPayload);
    }

}
