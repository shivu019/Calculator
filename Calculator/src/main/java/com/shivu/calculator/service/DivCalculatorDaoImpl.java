package com.shivu.calculator.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivu.calculator.dao.DivCalculatorDao;
import com.shivu.calculator.entity.Calculator;
import com.shivu.calculator.exception.CalculatorException;
import com.shivu.calculator.repository.CalculatorRepo;

@Service
public class DivCalculatorDaoImpl implements DivCalculatorDao{
	
	@Autowired
	private CalculatorRepo calculatorRepo;
 
	@Override
	public Calculator divvalue(Calculator calculator) throws CalculatorException {
calculator.setResult(calculator.getNumber1()/calculator.getNumber2());
		
		
		Calculator calc = calculatorRepo.save(calculator);
		if(Objects.isNull(calc))
			throw new CalculatorException("Failed to perform Division value operation");
		else
			return calc;
		 
	}

	@Override
	public List<Calculator> getDivResults() {
		// TODO Auto-generated method stub
		return null;
	}

}
