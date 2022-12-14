package com.github.NicolaiKopka.BudgetBookApp.api.controller;

import com.NicolaiKopka.budgetbookapp.api.AddExpenseInformationPayload;
import com.NicolaiKopka.budgetbookapp.api.AddExpenseResponsePayload;
import com.NicolaiKopka.budgetbookapp.api.ExpensesApi;
import com.github.NicolaiKopka.BudgetBookApp.api.service.ExpensesApiService;
import com.github.NicolaiKopka.BudgetBookApp.api.service.response.AddExpenseResponseWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExpensesApiController implements ExpensesApi {

    final ExpensesApiService expensesApiService;

    @Override
    public ResponseEntity<AddExpenseResponsePayload> addExpense(final AddExpenseInformationPayload addExpenseInformationPayload) {
        final AddExpenseResponseWrapper responseWrapper = expensesApiService.addNewExpense(addExpenseInformationPayload);
        return ResponseEntity.status(responseWrapper.getHttpStatus()).body(responseWrapper.getPayload());
    }
}
