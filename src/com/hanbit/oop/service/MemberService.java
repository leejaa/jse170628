package com.hanbit.oop.service;

public class MemberService {
	private String id,pw,gender,ssn,name,login;
	private int age;

	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setPw(String pw){
		this.pw=pw;
	}
	public String getPw(){
		return pw;
	}
	public void setGender(){
		char ch = ssn.charAt(7);
		
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
	}
	public String getGender(){
		return gender;
	}
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public String getLogin(){
		return login;
	}
	public void setAge(){
		String birth = ssn.substring(0,2);
		if(Integer.parseInt(birth)>=17){
			age = 2017-Integer.parseInt(birth)-1900+1;
		}else{
			age = 2017-Integer.parseInt(birth)-2000+1;
		}
	}
	public int getAge(){
		return age;
	}
	public void setLogin(String id,String pw){
		setAge();
		setGender();
		
		System.out.println("저장된 아이디 비번" + this.id + "/" + this.pw);
		System.out.println("입력한 아이디 비번"+ id + "/" + pw);
		if(id.equals(this.id)&&pw.equals(this.pw)){
			this.login=toString();
		}else{
			this.login="로그인실패..";
		}
	}
	public String toString(){
		return "Welcome "+name+"("+gender+") "+age+"살";
	}
}
