package com.kh.practice07.func;

public class Student {
	// 1. �ʵ� ����
	private String name;
	private int grade;
	private int classroom;
	private char gender;
	private double height;
	
	// 2. �ʵ� ���纻
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public char getGender() {
		return gender;
	}
	public double getHeight() {
		return height;
	}
	
	// 3. ������ �ʱ�ȭ
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	// 4. ���� �żҵ� �����
	public void information() {
		System.out.println("�л� �̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("�� : " + classroom);
		System.out.println("���� : " + gender);
		System.out.println("Ű : " + height);
	}
	
}
