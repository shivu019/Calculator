package com.shivu.calculator.dao;

import java.util.List;

import com.shivu.calculator.entity.Calculator;
import com.shivu.calculator.exception.CalculatorException;

public interface MulCalculatorDao {
	public List<Calculator> getMulResults();
	public Calculator mulvalue(Calculator calculator) throws CalculatorException;

}
