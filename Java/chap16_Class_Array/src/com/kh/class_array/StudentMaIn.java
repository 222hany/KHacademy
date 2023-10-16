package com.kh.class_array;

public class StudentMaIn {

	public static void main(String[] args) {
		// Student ��ü�� �����ϴ� �迭 ����
		Student[] student = new Student[3];
		
		// �迭�� Student ��ü�� �߰�
		// �ε��� [0]��° �л����� �ε��� [2]��° �л����� �߰� �����ϱ�
		student[0] = new Student("ȫ�浿", 17);
		student[1] = new Student("�踶��", 18);
		student[2] = new Student("�����", 19);
		
		// �� ���̸� ���ϰ� ������ length
		// 1 ��° �л��� �̸� student[0].name;
		// 1 ��° �л��� ���� student[0].age;
		System.out.println("�� �л� �� : " + student.length);
		System.out.println("ù ��° �л��� �̸� : " + student[0].name);
		System.out.println("ù ��° �л��� ���� : " + student[0].age);
		
		// 2 ��° �л��� �̸�, ���� ���
		System.out.println("�� ��° �л��� �̸� : " + student[1].name);
		System.out.println("�� ��° �л��� ���� : " + student[1].age);
		
		// 3 ��° �л��� �̸�, ���� ���
		System.out.println("�� ��° �л��� �̸� : " + student[2].name);
		System.out.println("�� ��° �л��� ���� : " + student[2].age);
		
		// for���� �̿��Ͽ� 1 ��° �л����� 3��° �л����� ���
		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i].name + " / ");
			System.out.println(student[i].age + "��");
		}
	}
}
