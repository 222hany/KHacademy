package com.kh.practice06.func;

public class Student {
	// 1. ��� ���� ����
	String name;
	int grade;
	int classroom;
	char gender;
	double height;
	
	// 2. ������
	/*public Student(String name, int grade, int classroom, char gender, double height) {
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
		this.gender = gender;
		this.height = height;
	}*/
	// ������ Ǯ��
	public Student() {
		this.name = "���ϴ�"; // name ���� "���ϴ�"�� �ʱ�ȭ
		this.grade = 1; // grade ���� 1�� �ʱ�ȭ
		this.classroom = 1; // classroom ���� 1�� �ʱ�ȭ
		this.gender = 'F'; // gender ���� 'F'�� �ʱ�ȭ
		this.height = 166.0; // height ���� 166.0�� �ʱ�ȭ
	}
	
	// 3. ���� ��� �żҵ�
	public void information() {
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("�� : " + classroom);
		System.out.println("���� : " + gender);
		System.out.println("Ű : " + height);
	}
}
