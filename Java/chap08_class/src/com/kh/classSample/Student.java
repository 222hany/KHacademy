package com.kh.classSample;

public class Student {
	// 1. ������� (�л��� �Ӽ�)
	String name;
	int age;
	String grade;
	
	// 2. ������
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	// 3. �л� ���� ��� �޼ҵ�
	public void displayInfo() {
		System.out.println("�л��̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�г� : " + grade);
	}
	

}
