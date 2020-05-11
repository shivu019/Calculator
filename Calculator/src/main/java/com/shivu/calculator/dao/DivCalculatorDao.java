package com.shivu.calculator.dao;

import java.util.List;

import com.shivu.calculator.entity.Calculator;
import com.shivu.calculator.exception.CalculatorException;

public interface DivCalculatorDao {
	public List<Calculator> getDivResults();
	public Calculator divvalue(Calculator calculator) throws CalculatorException;

}
