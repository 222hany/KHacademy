package com.kh.practice06.func;

public class Member {
	// 1. �������
	String memberId;
	String memberPw;
	String memberName;
	int age;
	char gender;
	String phone;
	String email;
	
	// 2. ������
	/*public Member(String memberId, String memberPw, String memberName, int age, char gender, String phone, String email) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;	
	}*/
	//������ Ǯ��
	public Member() {
	}
	
	// 3. ������¸żҵ�
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	public void printName() {
		System.out.println(memberName + " ȸ����");
	}
}
