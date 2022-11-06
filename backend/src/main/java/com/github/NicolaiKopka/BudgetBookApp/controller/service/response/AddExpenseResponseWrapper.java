package com.github.NicolaiKopka.BudgetBookApp.controller.service.response;

import com.NicolaiKopka.budgetbookapp.api.AddExpenseResponsePayload;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public class AddExpenseResponseWrapper {

    private final AddExpenseResponsePayload payload;
    private final HttpStatus httpStatus;
}
