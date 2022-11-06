package com.github.NicolaiKopka.BudgetBookApp.controller.conversion;

import com.NicolaiKopka.budgetbookapp.api.AddExpenseInformationPayload;
import com.NicolaiKopka.budgetbookapp.api.AddExpenseResponsePayload;
import com.github.NicolaiKopka.BudgetBookApp.domainDefinition.responses.AddExpenseResult;
import org.springframework.stereotype.Service;

@Service
public class ModelToPayloadConverter {

    public AddExpenseResponsePayload convert(final AddExpenseResult addExpenseResult) {
        final AddExpenseResponsePayload response = new AddExpenseResponsePayload();
        response.amount(addExpenseResult.getAmount());
        response.message(addExpenseResult.getMessage());
        return  response;

    }

}
