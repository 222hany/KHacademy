package com.kh.practice04.func;

import java.util.Scanner;

public class WhilePractice3 {

	public static void main(String[] args) {
		// ����ڷκ��� �Ѱ��� ���� �Է¹޾� 1���� �� ���� ������ ���ڵ��� ��� �Ųٷ� ���.
		// ��, �Է��� ���ڴ� 1���� ũ�ų� ���ƾ� ��.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			for (int i = num; i >= 1; i--) {
			System.out.println(i);
			}
		}

	}
}
