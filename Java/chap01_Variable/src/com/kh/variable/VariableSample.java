package com.kh.variable;

public class VariableSample {
	public static void main(String[] args) {
		String name;
		name = "����";
		
		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		
		System.out.println("�ȳ��ϼ���. " + name + "�Դϴ�. ���� " + hour + "�ÿ� ��۵˴ϴ�.");
		System.out.println("���� ������ " + score + "�� �Դϴ�.");
		System.out.println(score + "���� ���� " + grade + " �Դϴ�.");
		
		//������ �̸��� ���̿� �ڽ��� ����(double) ���(char)�� �ֱ�.
		String name2 = "���ϴ�";
		int age = 20;
		double score2 = 98.5;
		char grade2 = 'A';
		System.out.println("�ȳ��ϼ���. ���� �̸��� " + name2 + "�Դϴ�. ���� " + age + "�� �Դϴ�.");
		System.out.println(name2 + " �л��� ������ " + score2 + "�� �Դϴ�. ������ " + grade2 + " �Դϴ�.");
	}

}
