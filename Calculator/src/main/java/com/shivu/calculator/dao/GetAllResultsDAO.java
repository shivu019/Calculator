package com.shivu.calculator.dao;

import java.util.List;

import com.shivu.calculator.entity.Calculator;

public interface GetAllResultsDAO {

	public List<Calculator> getAllResults(String operation);
}
