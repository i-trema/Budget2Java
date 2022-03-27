package com.budget.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budget.model.Element;
import com.budget.repository.BudgetRepository;

@Service
public class BudgetService {
	@Autowired
	BudgetRepository budgetRepository;
	
	public Element create(Element el) {
		return budgetRepository.save(el);
	}
	

	public List<Element> readAll(){
		return budgetRepository.findAll();
	}

	public Optional<Element> readById(long id){
		return budgetRepository.findById(id);
	}
	
	public void deleteById(long id) {
		budgetRepository.deleteById(id);
	}
	public void delete(Element element) {
		budgetRepository.delete(element);
	}
}
