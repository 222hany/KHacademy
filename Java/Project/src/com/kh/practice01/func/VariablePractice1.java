package com.kh.practice01.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
		String name, sex;
		int age;
		double height;
		
		System.out.print("�̸��� �Է��� �ּ���.");
		name = sc.next();
		System.out.print("������ �Է��� �ּ���. (��/��)");
		sex = sc.next();
		System.out.print("���̸� �Է��� �ּ���.");
		age = sc.nextInt();
		System.out.print("Ű�� �Է��� �ּ���.");
		height = sc.nextDouble();
		
		System.out.println("Ű" + height + "cm �� " + sex + "�� " + name + "�� �ݰ����ϴ�. (^^)");
	}

}