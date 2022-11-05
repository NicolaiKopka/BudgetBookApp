package com.github.NicolaiKopka.BudgetBookApp.controller;

import com.NicolaiKopka.budgetbookapp.api.AddExpenseInformationPayload;
import com.NicolaiKopka.budgetbookapp.api.AddExpenseResponsePayload;
import com.NicolaiKopka.budgetbookapp.api.ExpensesApi;
import com.github.NicolaiKopka.BudgetBookApp.service.ExpensesApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExpensesApiController implements ExpensesApi {

    final ExpensesApiService expensesApiService;

    @Override
    public ResponseEntity<AddExpenseResponsePayload> addNewExpense(final AddExpenseInformationPayload addExpenseInformationPayload) {
        expensesApiService.addNewExpense(addExpenseInformationPayload);
        return null;
    }
}
