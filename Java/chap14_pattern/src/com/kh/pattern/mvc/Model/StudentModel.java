package com.kh.pattern.mvc.Model;

public class StudentModel {
	private String name; // �л� �̸�
	private int age;     // �л� ����
	
	public StudentModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

}
