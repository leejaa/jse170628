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
			switch(JOptionPane.showInputDialog("0.종료 1.회원추가 2.회원수보기 3.회원목록보기 4.검색 by ID 5.검색 by NAME 6.비밀번호변경 7.회원탈퇴")){
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
				MemberBean memberById=service.memberById(JOptionPane.showInputDialog("찾고자 하는 ID를 입력해주세요"));
				if(memberById==null){
					JOptionPane.showMessageDialog(null, "찾고자하는 아이디가 없습니다..");
					break;
				}
				JOptionPane.showMessageDialog(null, memberById.toString());
				break;
			case "5":
				service.setMemberByName(JOptionPane.showInputDialog("찾고자 하는 이름을 입력해주세요"));
				MemberBean[] memberByName=service.getMemberByName();
				if(memberByName.length==0){
					JOptionPane.showMessageDialog(null, "찾고자 하는 이름이 없습니다..");
					break;
				}
				System.out.println("배열의 총 개수는 "+memberByName.length+"개 이고 첫번째 회원 이름은 "+memberByName[0].getName()+"입니다");
				JOptionPane.showMessageDialog(null, service.getMemberByNameList());
				break;
			case "6": 
				MemberBean changingMember=new MemberBean();
				String id=JOptionPane.showInputDialog("변경하고자 하는 회원의 아이디를 입력해주세요");
				if(service.memberById(id)==null){
					JOptionPane.showMessageDialog(null, "조회되는 아이디가 없습니다..");
					break;
				}
				String pw=JOptionPane.showInputDialog("새로운 비밀번호를 입력해주세요");
				changingMember.setId(id);
				changingMember.setPw(pw);
				service.updataPw(changingMember);
				JOptionPane.showMessageDialog(null, "비밀번호 변경 성공..");
				break;
			case "7" :
				service.delete(JOptionPane.showInputDialog("탈퇴하고자 하는 회원의 아이디를 입력해주세요"));
				JOptionPane.showMessageDialog(null,"탈퇴가 완료되었습니다..");
				break;
			default :
				break;
			}
		}
	}
}
