package com.kh.practice01.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		// Ű���忡�� ���� �� ���� �Է¹޾�, �� ���� ��, ��, ��, ������ �� ��� �������� ����Ͻÿ�.
		int num1, num2;
		System.out.print("���ڸ� �Է��� �ּ���.");
		num1 = sc.nextInt();
		System.out.print("�� �ٸ� ���ڸ� �Է��� �ּ���.");
		num2 = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ ���(��) : " + (num1 / num2));
		System.out.println("������ ���(������) : " + (num1 % num2));
	}

}
