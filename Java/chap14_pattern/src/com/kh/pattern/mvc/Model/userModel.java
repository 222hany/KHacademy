package com.kh.pattern.mvc.Model;
// ���� ���� ǥ��
// private �̸� ����
// getter setter �����

public class userModel {
	private String name;
	private int age;
	
	public userModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
	}

}
