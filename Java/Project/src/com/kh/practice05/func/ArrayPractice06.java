package com.kh.practice05.func;

public class ArrayPractice06 {

	public static void main(String[] args) {
		
		// 1. �ֹι�ȣ �����
		String jumin = "123456-1234567";
		
		// 2. �����ڸ� ���� ��ǥ �����
		String star = "*";
		char[] juminStar = jumin.toCharArray(); //to Char Array�� ����ؼ� String -> Char Array�� ����
		//{'1', '2', '3', '4', '5', '6', '-', '1', '2', '3', '4', '5', '6', '7'}
		for (int i = 8; i <= 13 ; i++) { // �ֹι�ȣ 9�ڸ����� ���ڸ����� ��ǥó��
			juminStar[i] = '*';
		}
		System.out.println(juminStar);
	}

}
