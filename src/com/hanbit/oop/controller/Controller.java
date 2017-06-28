package com.hanbit.oop.controller;
import java.util.Scanner;
import com.hanbit.oop.service.BmiService;
import com.hanbit.oop.service.CalculatorService;
import com.hanbit.oop.service.GradeReportService;
import com.hanbit.oop.service.LeapYearService;
import com.hanbit.oop.service.LoginService;
import com.hanbit.oop.service.SSNService;
import com.hanbit.oop.service.SecondService;
import com.hanbit.oop.service.TaxCalculatorService;

public class Controller {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		BmiService s2=new BmiService();
		TaxCalculatorService ts=new TaxCalculatorService();
		CalculatorService cs=new CalculatorService();
		LeapYearService ls=new LeapYearService();
		GradeReportService gs=new GradeReportService();
		LoginService login=new LoginService();
		SSNService ss=new SSNService();
		SecondService sce=new SecondService();
		
		while (true) {
			System.out.println("select menu...  0.stop 1.bmi 2.tax 3.Calculator 4.LeapYear 5.GradeReport 6.Login 7.SSN 8.Time");
			switch (s.next()) {
			case "0":
				System.out.println("bmi stop..");
				return;
			case "1":
				System.out.println("Write Your Weight ..");
				double weight=s.nextDouble();
				System.out.println("Write Your Height..");
				double height=s.nextDouble();
				String result=s2.excute(weight,height);
				System.out.print(String.format("당신은 %s 입니다 \n", result ));
				break;
			case "2" : 
				System.out.println("Write Your Name..");
				String name=s.next();
				System.out.println("Write your Salary..");
				double salary=s.nextDouble();
				double tax=ts.excute(salary);
				System.out.println(String.format("%s님께서 납부하실 세금은 %d 원 입니다..", name,tax));
				break;
			case "3":
				System.out.println("첫번째 수를 입력해주세요..");
				int num1=s.nextInt();
				System.out.println("첫번째 수를 입력해주세요..");
				int num2=s.nextInt();
				System.out.println("opcode를 입력해주세요..");
				String opcode=s.next();
				int result2=cs.excute(num1, num2, opcode);
				System.out.println(String.format("결과값 : %d", result2));
				break;
			case "4":
				System.out.println("년도를 입력해주세요..");
				int year=s.nextInt();
				String leapYear=ls.excute(year);
				System.out.println(leapYear+"입니다..");
				break;
			case "5":
				System.out.println("국어점수를 입력해주세요..");
				int kor=s.nextInt();
				System.out.println("영어점수를 입력하세요..");
				int eng=s.nextInt();
				System.out.println("수학점수를 입력하세요..");
				int math=s.nextInt();
				String ment=gs.excute(kor, eng, math);
				System.out.println(ment);
				break;
			case "6":
				System.out.println("ID를 입력해주세요..");
				String id=s.next();
				System.out.println("PW를 입력해주세요..");
				String pw=s.next();
				String loginResult=login.excute(id, pw);
				System.out.println(loginResult);
				break;
			case "7":
				System.out.println("이름을 입력해주세요..");
				String name2=s.next();
				System.out.println("주민등록번호를 입력해주세요..");
				String ssn=s.next();
				String result3=ss.excute(name2, ssn);
				System.out.println(result3);
				break;
			case "8":
				System.out.println("초를 입력해주세요..");
				int second=s.nextInt();
				String ment2=sce.excute(second);
				System.out.println(ment2);
				break;
			}
		}
	}
}
