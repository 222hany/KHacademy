package com.kh.practice04.func;

import java.util.Scanner;

public class WhilePractice1 {

	public static void main(String[] args) {
		// ����ڷκ��� �Ѱ��� ���� �Է¹޾� 1���� �� ���� ������ ���ڵ��� ��� ���. �� �Է��� ���ڴ� 1���� ũ�ų� ���ƾ� ��.
		// ���� 1 �̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���."�� ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			for (int i = 1; i <= num; i++) {
			System.out.println(i);
			}
		}

	}

}
