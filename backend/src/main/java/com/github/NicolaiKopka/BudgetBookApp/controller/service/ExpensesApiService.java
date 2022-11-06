package com.github.NicolaiKopka.BudgetBookApp.controller.service;

import com.NicolaiKopka.budgetbookapp.api.AddExpenseInformationPayload;
import com.NicolaiKopka.budgetbookapp.api.AddExpenseResponsePayload;
import com.github.NicolaiKopka.BudgetBookApp.controller.conversion.ModelToPayloadConverter;
import com.github.NicolaiKopka.BudgetBookApp.controller.conversion.PayloadToModelConverter;
import com.github.NicolaiKopka.BudgetBookApp.controller.service.response.AddExpenseResponseWrapper;
import com.github.NicolaiKopka.BudgetBookApp.domainDefinition.AddExpenseInformation;
import com.github.NicolaiKopka.BudgetBookApp.domainDefinition.ExpensesService;
import com.github.NicolaiKopka.BudgetBookApp.domainDefinition.responses.AddExpenseResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExpensesApiService {

    final PayloadToModelConverter payloadToModelConverter;
    final ModelToPayloadConverter modelToPayloadConverter;
    final ExpensesService expensesService;

    public AddExpenseResponseWrapper addNewExpense(final AddExpenseInformationPayload addExpenseInformationPayload) {
        final AddExpenseInformation addExpenseInformation = payloadToModelConverter.convert(addExpenseInformationPayload);
        final AddExpenseResult addExpenseResult = expensesService.addNewExpense(addExpenseInformation);
        final AddExpenseResponsePayload addExpenseResponse = modelToPayloadConverter.convert(addExpenseResult);
        // TODO add status enum to AddExpenseResult and switch for it
        return new AddExpenseResponseWrapper(addExpenseResponse, HttpStatus.CREATED);
    }

}
