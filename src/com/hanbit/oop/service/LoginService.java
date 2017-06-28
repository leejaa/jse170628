package com.hanbit.oop.service;

public class LoginService {
	public static final String USER_ID="kim";
	public static final String USER_PW="kim";
	
	public String excute(String id,String pw){
		String loginResult="";
		if(id.equals(USER_ID)&&pw.equals(USER_PW)){
			loginResult="로그인성공...";
		}else{
			loginResult="로그인실패...";
		}
		return loginResult;
	}
}
