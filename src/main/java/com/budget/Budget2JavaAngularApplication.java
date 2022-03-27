package com.budget;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.budget.model.Element;
import com.budget.service.BudgetService;

@SpringBootApplication
public class Budget2JavaAngularApplication {
//	@Autowired
//	BudgetService budgetApi;
	
	public static void main(String[] args) {
		SpringApplication.run(Budget2JavaAngularApplication.class, args);
	}
	
	
//	public void run(String...args) throws Exception {
//		Element el1 = new Element(100, null, "courses", "cvxvx");
//		budgetApi.create(el1);
		
//		Element el2 = new Element(22, null, "courses", "fzef");
//		budgetApi.create(el2);
//		
//		Element el3 = new Element(536, null, "impots", "dfgsdff");
//		budgetApi.create(el3);
//		
		
	}
	
	


