package com.github.NicolaiKopka.BudgetBookApp.domain;

import com.github.NicolaiKopka.BudgetBookApp.domain.responses.AddExpenseResult;

public interface ExpensesService {

    AddExpenseResult addNewExpense(final AddExpenseInformation addExpenseInformation);
}
