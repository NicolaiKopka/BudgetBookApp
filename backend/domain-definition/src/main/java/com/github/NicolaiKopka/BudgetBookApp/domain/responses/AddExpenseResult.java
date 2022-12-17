package com.github.NicolaiKopka.BudgetBookApp.domain.responses;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
public class AddExpenseResult {

    private final BigDecimal amount;
    private final String message;
}
