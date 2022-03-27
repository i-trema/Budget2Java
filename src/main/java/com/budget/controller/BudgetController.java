package com.budget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.budget.model.Element;
import com.budget.repository.BudgetRepository;
import com.budget.service.BudgetService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class BudgetController {
	@Autowired
	BudgetRepository budgetRepository;
	@Autowired
	BudgetService budgetService;
	
//	@GetMapping("")
//	public ModelAndView getPage() {
//	ModelAndView mv = new ModelAndView("index.html");
//	return mv;
//	}
//	
	
	@PostMapping("add")
	@ResponseBody
	public void add(@RequestBody Element budget) {
//		Element el1 = new Element();
		budgetService.create(budget);
//	public void ajouter(@RequestParam Double montant, String date, String categorie, String commentaire) {
//		Element el1 = new Element(montant, date, categorie, commentaire);
//		budgetService.create(el1);	
		 
	} 
	
	@GetMapping("elements")
	public List<Element> getElements(){
		List<Element> elements = budgetService.readAll();
		return elements;		
	}
	
	@DeleteMapping("supprimer/{id}")
	public void deleteElement(@PathVariable long id, Element budget){
		budget.setId(id);
		budgetService.delete(budget);
	}
	
	
//	@PostMapping("supprimer")
//	@ResponseBody
//	public void supprimer(@RequestParam int id) {
//		
//		budgetService.delete(id);	
//	} 
	
	
	
	
	
}
