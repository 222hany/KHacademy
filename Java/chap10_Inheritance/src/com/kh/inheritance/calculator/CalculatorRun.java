package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends CalculatorForMod {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		/*
		int result1 = cal.add(10, 5);
		int result2 = cal.substruct(10, 5);
		int result3 = cal.multiply(10, 5);
		int result4 = cal.divide(10, 5);
		
		System.out.println("���ϱ� ��� : " + result1);
		System.out.println("���� ��� : " + result2);
		System.out.println("���ϱ� ��� : " + result3);
		System.out.println("������ ��� : " + result4);
		*/
		
		
		// Scanner �̿��ؼ� �ڵ� �����ϱ�
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ���.");
		int num2 = sc.nextInt();
		
		int result1 = cal.add(num, num2);
		int result2 = cal.substruct(num, num2);
		int result3 = cal.multiply(num, num2);
		int result4 = cal.divide(num, num2);
		
		System.out.println("���ϱ� ��� : " + result1);
		System.out.println("���� ��� : " + result2);
		System.out.println("���ϱ� ��� : " + result3);
		System.out.println("������ ��� : " + result4);
		*/
		
		
		// ���� ��� ������Ʈ
		/*
		Scanner sc = new Scanner(System.in);
		CalculatorForMod cal2 = new CalculatorForMod();
		
		System.out.println("���ڸ� 2�� �Է����ּ���.");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result1 = cal.add(num, num2);
		int result2 = cal.substruct(num, num2);
		int result3 = cal.multiply(num, num2);
		int result4 = cal.divide(num, num2);
		int result5 = cal2.mod(num, num2);
		
		System.out.println("add : " + result1);
		System.out.println("mod : " + result5);
		*/

	}

}
