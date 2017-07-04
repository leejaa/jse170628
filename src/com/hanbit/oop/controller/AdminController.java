package com.hanbit.oop.controller;
import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args) {
		String sCount=JOptionPane.showInputDialog("관리자님 총회원수를 입력해주세요");
		AdminService service=new AdminServiceImpl(Integer.parseInt(sCount));
		MemberBean member=null;
		while(true){
			switch(JOptionPane.showInputDialog("0.종료 1.회원추가 2.회원수보기 3.회원목록보기 4.검색 by ID 5.검색 by NAME")){
			case "0":
				return;
			case "1":
				member=new MemberBean();
				String[] arr=JOptionPane.showInputDialog("NAME/ID/PASS/SSN").split("/");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				service.addMember(member);
				JOptionPane.showMessageDialog(null,"회원가입성공 !");
				break;
			case "2":
				JOptionPane.showConfirmDialog(null,service.countMembers()+"명");
				break;
			case "3":
				JOptionPane.showConfirmDialog(null, service.toString());
				break;
			case "4":
				JOptionPane.showConfirmDialog(null, service.getFindMember(JOptionPane.showInputDialog("찾고자 하는 ID를 입력해주세요")).toString());
				break;
			case "5":
				service.setMemberByName(JOptionPane.showInputDialog("찾고자 하는 이름을 입력해주세요"));
				MemberBean[] memberByName=service.getMemberByName();
				System.out.println("배열의 총 개수는 "+memberByName.length+"개 이고 첫번째 회원 이름은 "+memberByName[0].getName()+"입니다");
				JOptionPane.showMessageDialog(null, service.getMemberByNameList());
				break;
			}
		}
	}
}
