package com.budget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.budget.model.Element;
@Repository
public interface BudgetRepository extends JpaRepository<Element, Long>{

}
