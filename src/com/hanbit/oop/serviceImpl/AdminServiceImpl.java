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
			memberList+=members[i].getId()+"/ "+members[i].getName()+"/ "+members[i].getSsn()+"/"+members[i].getPw()+"\n";
		}
		return memberList;
	}
	@Override
	public MemberBean memberById(String id){
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
		int j=0;
		
		for(int i=0;i<count;i++){
			if(name.equals(members[i].getName())){
				j++;
				System.out.println("이름 찾았습니다 ! 현재 findingCnt는 "+findingCnt);
				memberByName[j-1]=members[i];
			}
			if(findingCnt==j){
				break;
			}
		}
	}
	@Override
	public String getMemberByNameList() {
		String memberByNameList="";
		for(int i=0;i<memberByName.length;i++){
			memberByNameList+="아이디 : "+memberByName[i].getId()+"/ 이름 :"+memberByName[i].getName()+"\n";
		}
		return memberByNameList;
	}
	@Override
	public void updataPw(MemberBean member) {
		MemberBean toChangeMember= memberById(member.getId());
		toChangeMember.setPw(member.getPw());
	}
	@Override
	public void delete(String id) {
		int index=0;
		MemberBean newMembers[]=new MemberBean[count-1];
		for(int i=0;i<count;i++){
			if(id.equals(members[i].getId())){
				index=i;
				break;
			}
		}
		for(int i=0;i<index;i++){
			newMembers[i]=members[i];
		}
		for(int i=index;i<count-1;i++){
			newMembers[i]=members[i+1];
		}
		count--;
		members=newMembers;
	}
}
