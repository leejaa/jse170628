package com.hanbit.oop.service;

public class BmiService {
	public String excute(double weight, double height){
		
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
}
