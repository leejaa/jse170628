package com.hanbit.oop.controller;
import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args) {
		String sCount=JOptionPane.showInputDialog("관리자님 총회원수를 입력해주세요");
		AdminService service=new AdminServiceImpl(Integer.parseInt(sCount));
		MemberBean member=new MemberBean();
		while(true){
			switch(JOptionPane.showInputDialog("0.종료 1.회원추가 2.회원수보기 3.회원목록보기")){
			case "0":
				return;
			case "1":
				member.setId(JOptionPane.showInputDialog("ID를 입력하세요"));
				member.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				member.setPw(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
				member.setSsn(JOptionPane.showInputDialog("주민번호를 입력하세요"));
				service.addMember(member);
				JOptionPane.showMessageDialog(null,"회원가입성공 !");
				break;
			case "2":
				JOptionPane.showConfirmDialog(null,service.countMembers()+"명");
				break;
			case "3":
				JOptionPane.showConfirmDialog(null, service.toString());
				break;
			}
		}
	}
}
