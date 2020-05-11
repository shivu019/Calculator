package com.shivu.calculator.dao;

import java.util.List;

import com.shivu.calculator.entity.Calculator;
import com.shivu.calculator.exception.CalculatorException;

public interface AddCalculatorDao {
	
	
	
	public List<Calculator> getAddResults();

	public Calculator addValue(Calculator calculator) throws CalculatorException;
	
	 

}
