package com.shivu.calculator.dao;

import java.util.List;

import com.shivu.calculator.entity.Calculator;
import com.shivu.calculator.exception.CalculatorException;

public interface SubCalculatorDao {
	
	public List<Calculator> getSubResults();
	public Calculator subvalue(Calculator calculator) throws CalculatorException;

}
