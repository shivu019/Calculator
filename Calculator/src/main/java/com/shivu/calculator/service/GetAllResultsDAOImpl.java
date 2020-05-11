package com.shivu.calculator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivu.calculator.dao.GetAllResultsDAO;
import com.shivu.calculator.entity.Calculator;
import com.shivu.calculator.repository.CalculatorRepo;

@Service
public class GetAllResultsDAOImpl implements GetAllResultsDAO {
	
	@Autowired
	private CalculatorRepo calculatorRepo;

	@Override
	public List<Calculator> getAllResults(String operation) {
		 
		
		
		return calculatorRepo.findByOperation(operation);
	}

}
