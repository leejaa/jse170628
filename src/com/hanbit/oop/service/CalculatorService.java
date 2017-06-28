package com.hanbit.oop.service;

public class CalculatorService {
	public int excute(int num1,int num2,String opcode){
		System.out.print("Enter opcode\n");
		int result=0;
		if(opcode.equals("+")){
			result=num1+num2;
		}else if(opcode.equals("-")){
			result=num1-num2;
		}else if(opcode.equals("*")){
			result=num1*num2;
		}else{
			result=num1/num2;
		}
		return result;
	}
}
