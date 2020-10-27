package org.gabibarbosa.dao;

import org.gabibarbosa.model.ConverterModel;
import org.springframework.stereotype.Repository;

@Repository
public class ConverterDAO {

	public double converter(ConverterModel currency) {
	   double value =  currency.getUsd() * currency.getBrl();
	   
	   return value;
	}
}
