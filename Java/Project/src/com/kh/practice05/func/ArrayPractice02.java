package com.kh.practice05.func;

import java.util.Scanner;

public class ArrayPractice02 {

	public static void main(String[] args) {
		// "��" ~ "��" ���� �ʱ�ȭ �� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է¹޾� �Է��� ���ڿ� ���� �ε����� �ִ�
		// ������ ���. ������ ���� ���ڸ� �Է� �� "�߸� �Է��ϼ̽��ϴ�."�� ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ���� 6 ������ ���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		
		String[] day = {"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���"};
		if(num >= 0 && num < 6) {
			for (int i = 0; i < day.length; i++) {
				if(i == num) {
				System.out.println(day[i]);
				}
			}
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

}
