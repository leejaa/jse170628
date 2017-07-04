package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService{
	int count;
	MemberBean member;
	MemberBean[] members;
	MemberBean[] memberByName;
	
	public AdminServiceImpl(int sCount) {
		count=0;
		members=new MemberBean[sCount];
		member=new MemberBean();
	}
	@Override
	public void addMember(MemberBean member) {
		setCount();
		members[getCount()-1]=member;
	}
	@Override
	public MemberBean[] getMembers() {
		return members;
	}
	@Override
	public int countMembers() {
		return count;
	}
	public void setCount(){
		count++;
	}
	public int getCount(){
		if(count>members.length){
			count=members.length;
		}
		return count;
	}
	public String toString(){
		String memberList="";
		for(int i=0;i<count;i++){
			memberList+=members[i].getId()+"/ "+members[i].getName()+"/ "+members[i].getSsn()+"\n";
		}
		return memberList;
	}
	@Override
	public MemberBean getFindMember(String id){
		MemberBean member=null;
		for(int i=0;i<count;i++){
			if(id.equals(members[i].getId())){
				member=members[i];
				break;
			}
		}
		return member;
	}
	public MemberBean[] getMemberByName(){
		return memberByName;
	}
	@Override
	public void setMemberByName(String name){
		int findingCnt=0;
		
		for(int i=0;i<count;i++){
			if(name.equals(members[i].getName())){
				findingCnt++;
				System.out.println("이름 찾았습니다 ! 현재 findingCnt는 "+findingCnt);
			}
		}
		
		memberByName=new MemberBean[findingCnt];
		findingCnt=0;
		for(int i=0;i<count;i++){
			if(name.equals(members[i].getName())){
				findingCnt++;
				System.out.println("이름 찾았습니다 ! 현재 findingCnt는 "+findingCnt);
				memberByName[findingCnt-1]=members[i];
			}
		}
	}
}
