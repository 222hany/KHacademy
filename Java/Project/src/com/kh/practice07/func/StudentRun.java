package com.kh.practice07.func;

public class StudentRun {

	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println("�л� ����");
		
		// set �����ϱ�
		student1.setName("���ϴ�");
		student1.setGrade(1);
		student1.setClassroom(3);
		student1.setGender('F');
		student1.setHeight(166.0);
		
		// ���
		student1.information();
	}

}
