package com.github.NicolaiKopka.BudgetBookApp.domainDefinition;

import com.github.NicolaiKopka.BudgetBookApp.domainDefinition.responses.AddExpenseResult;

public interface ExpensesService {

    AddExpenseResult addNewExpense(final AddExpenseInformation addExpenseInformation);
}
