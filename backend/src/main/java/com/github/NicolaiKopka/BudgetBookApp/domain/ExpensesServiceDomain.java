package com.github.NicolaiKopka.BudgetBookApp.domain;

import com.github.NicolaiKopka.BudgetBookApp.domainDefinition.AddExpenseInformation;
import com.github.NicolaiKopka.BudgetBookApp.domainDefinition.ExpensesService;
import com.github.NicolaiKopka.BudgetBookApp.domainDefinition.responses.AddExpenseResult;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ExpensesServiceDomain implements ExpensesService {

    @Override
    public AddExpenseResult addNewExpense(AddExpenseInformation addExpenseInformation) {
        return null;
    }
}
