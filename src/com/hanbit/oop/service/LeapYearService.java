package com.hanbit.oop.service;

public class LeapYearService {
	public String excute(int year){
		
		/*
		연도를 4로 나눈값이 0이라면 윤년일수 있다. 그러나 해당연수가 100으로 나누어 떨어지면 평년이다.
		2000년은 4로 나눈 값이 0이라서 윤년일수 있는데 다시 이 값이 100으로 나눠 떨어지면 평년이다.
		평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
		
		*/
			String result = "";
		
		if(year%4==0 && year%100==0){
			result = "평년";
		}else if(year%4==0){
			result = "윤년";
		}else if(year%100==0 && year%400==0){
			result = "윤년";
		}else{
			result="평년";
		}
			return result;
			
			
		}
}
