package com.hanbit.oop.service;

public class TaxCalculatorService {
public double excute(double salary){
		
		double TAX_RATE = 0.097;
		double tax=salary*TAX_RATE;
		return tax;
	}
}
