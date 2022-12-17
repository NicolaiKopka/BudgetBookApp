package com.github.NicolaiKopka.BudgetBookApp.api.conversion;

import com.NicolaiKopka.budgetbookapp.api.AddExpenseResponsePayload;
import com.github.NicolaiKopka.BudgetBookApp.domain.responses.AddExpenseResult;
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
