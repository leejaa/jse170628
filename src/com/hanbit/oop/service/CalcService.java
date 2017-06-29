package com.hanbit.oop.service;

public class CalcService {
	public String calcBMI(double weight, double height){
		
		double height2 = height/100;
		double bmi = weight/height2/height2;
		String result="";
		
		if(bmi-18.5<0){
			result = "저체중";
		}else if(bmi-24.9<0){
			result = "정상";
		}else if(bmi-29.9<0){
			result = "과체중";
		}else{
			result = "비만";
		}
		return result;
	}
	public int calcPlus(int n1,int n2){
		return n1+n2;
	}
	public int calcMinus(int n1,int n2){
		return (n1>n2)?n1-n2:n2-n1;
	}
	public int calcDivide(int n1,int n2){
		return (n1>n2)?n1/n2:n2/n1;
	}
	public double calcTax(int salary){
		return 0.097*salary;
	}
	public int calcTime(int second){
		return n1*n2;
	}
}
