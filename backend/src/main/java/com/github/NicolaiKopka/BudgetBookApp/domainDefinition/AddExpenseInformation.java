package com.github.NicolaiKopka.BudgetBookApp.domainDefinition;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
@ToString
public class AddExpenseInformation {

    private final BigDecimal amount;

    private final Integer intervalNumber;

    private final String intervalSpecification;

    private final Long dueDate;
}
