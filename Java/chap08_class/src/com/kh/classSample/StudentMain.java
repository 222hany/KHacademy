package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// �л��� ��ü ����
		Student student1 = new Student("���ϴ�", 20, "1�г�");
		
		// �л� ���� ���
		student1.displayInfo();
		
		// �л��� 3�� ���� ����ϱ�
		Student student2 = new Student("�̹���", 20, "1�г�");
		Student student3 = new Student("�����", 21, "2�г�");
		Student student4 = new Student("������", 22, "3�г�");
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
	}

}
