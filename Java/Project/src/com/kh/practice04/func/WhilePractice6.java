package com.kh.practice04.func;

import java.util.Scanner;

public class WhilePractice6 {

	public static void main(String[] args) {
		// ����ڷκ��� �� ���� ���� �Է¹޾� �� ������ ���ڸ� ��� ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է����ּ���.");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ���.");
		int num2 = sc.nextInt();
		/*int i;
		
		while (num1 > num2) {
			i = --num1;
			System.out.println(i);
		}*/
		
		//������ Ǯ��
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
	}

}
