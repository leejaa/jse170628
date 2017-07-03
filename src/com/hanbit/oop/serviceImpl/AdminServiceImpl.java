package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService{
	int count;
	MemberBean member;
	MemberBean[] members;
	public AdminServiceImpl(int sCount) {
		members=new MemberBean[sCount];
	}
	@Override
	public void addMember(MemberBean member) {
		setCount();
		members[getCount()-1]=member;
	}
	@Override
	public String getMembers() {
		String MemberList="";
		for(int i=0;i<count;i++){
			MemberList+="id : "+members[i].getId()+"/ pw : "+members[i].getPw();
		}
		System.out.println("");
		return MemberList;
	}
	@Override
	public int countMembers() {
		return members.length;
	}
	public void setCount(){
		count++;
	}
	public int getCount(){
		return count;
	}
}
