package com.kh.practice03.func;

import java.util.Scanner;

public class IfPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���.");
		
		int number = sc.nextInt();
		
		if (number/2 != 0 && number > 0) {
			System.out.println("Ȧ����.");
		} else if (number/2 == 0 && number > 0) {
			System.out.println("¦����.");
		} else {
			System.out.println("����� �Է����ּ���");
		}

	}

}