package com.hanbit.oop.service;

public class SSNService {
	public String excute(String name,String ssn){
		char ch = ssn.charAt(7);
		String birth = ssn.substring(0,2);
		System.out.print("birth : "+ birth);
		int age = 0;
		if(Integer.parseInt(birth)>=17){
			age = 2017-Integer.parseInt(birth)-1900+1;
		}else{
			age = 2017-Integer.parseInt(birth)-2000+1;
		}
		String gender = "", ment="";
		switch(ch){
			case '1' : case '3' :
				gender = "남자"; 
				break;
			case '2' : case '4' :
				gender = "여자";
				break;
			case '5' : case '6' :
				gender = "외국인";
				break;
			default :
				gender = "기타";
				break;
			}
		ment=name+"/ "+age+"살/ "+gender;
		return ment;
	}
}
