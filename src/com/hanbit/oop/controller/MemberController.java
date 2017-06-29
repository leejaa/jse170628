package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.oop.service.CalendarService;
import com.hanbit.oop.service.MemberService;

public class MemberController {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		MemberService ms=new MemberService();
		CalendarService cs=new CalendarService();
		while(true){
			System.out.println("0.end 1.join 2.login ");
			switch (s.next()) {
			case "0" :
				System.out.println("System 종료...");
				return;
			case "1":
				System.out.println("Input Name..");
				String name=s.next();
				ms.setName(name);
				System.out.println("Input ID..");
				String id=s.next();
				ms.setId(id);
				System.out.println("Input PW..");
				String pw=s.next();
				ms.setPw(pw);
				System.out.println("Input SSN..");
				String ssn=s.next();
				ms.setSsn(ssn);
				System.out.println("입력한 아이디와 비번은 "+ms.getId()+ "/"+ ms.getPw()+" 입니다. Join Complete...");
				break;
			case "2":
				System.out.println("Input ID...");
				String InputId=s.next();
				System.out.println("Input PW...");
				String InputPw=s.next();
				ms.setLogin(InputId, InputPw);
				System.out.println(ms.getLogin());
				break;
			}
		}
	}
}
