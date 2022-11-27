package com.github.NicolaiKopka.BudgetBookApp.domainDefinition.responses;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
public class AddExpenseResult {

    private final BigDecimal amount;
    private final String message;
}
