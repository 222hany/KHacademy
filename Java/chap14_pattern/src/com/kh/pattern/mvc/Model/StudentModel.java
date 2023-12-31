package com.kh.pattern.mvc.Model;

public class StudentModel {
	private String name; // 학생 이름
	private int age;     // 학생 나이
	
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
