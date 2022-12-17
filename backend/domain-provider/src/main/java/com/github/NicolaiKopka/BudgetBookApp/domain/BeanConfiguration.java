package com.github.NicolaiKopka.BudgetBookApp.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.github.NicolaiKopka.BudgetBookApp"})
class BeanConfiguration {

    @Bean
    ExpensesService expensesService() {
        return new ExpensesServiceDomain();
    }
}
