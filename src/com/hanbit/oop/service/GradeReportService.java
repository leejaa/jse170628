package com.hanbit.oop.service;

import java.util.Scanner;

public class GradeReportService {
	public String excute(int kor,int eng,int math){
		int total=kor+eng+math;
		int avg=total/3;
		String ment="";
		
		switch(avg/10){
			case 9 :
			case 10 :
				ment=" A학점입니다. 장학금 대상입니다 !"; 
				break;
			case 8 :
				ment="B학점입니다. 3학점이수 성공!";
				break;
			case 7 :
				ment="C학점입니다. 2학점 이수 성공!"; 
				break;
			case 6 :
				ment="D학점입니다. 1학점 이수 성공!";
				break;
			case 5 :
				ment="E학점입니다. ";
			default :
				ment="학사경고 !"; 
				break;
		}
		
		return ment;
		
}
}
