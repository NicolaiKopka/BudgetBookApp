package com.github.NicolaiKopka.BudgetBookApp.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.github.NicolaiKopka.BudgetBookApp"})
public class BudgetBookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetBookAppApplication.class, args);
	}

}
