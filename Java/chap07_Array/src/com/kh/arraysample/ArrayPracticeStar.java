package com.kh.arraysample;

import java.util.Scanner;

public class ArrayPracticeStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 5 ;i++) { // i = �� ����
			for (int j = 1; j <=5; j++) { // j = �� ����
				if (i == 1 || j == 1 || j == num || i == num) { // i == 1 ���� 1�� ��� (���� ����)
					                                // j == 1 ���� �࿡�� ����ϴ� ���� ù ��° ���� ���
					                                // j == num ���� �࿡�� ���� ������ ���� ���
					                                // i == num ���� �������� ��� (���� �Ʒ���)
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} System.out.println();
		}

	}

}
