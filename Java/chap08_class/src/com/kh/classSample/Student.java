package com.kh.classSample;

public class Student {
	// 1. 멤버변수 (학생의 속성)
	String name;
	int age;
	String grade;
	
	// 2. 생성자
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	// 3. 학생 정보 출력 메소드
	public void displayInfo() {
		System.out.println("학생이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학년 : " + grade);
	}
	

}
