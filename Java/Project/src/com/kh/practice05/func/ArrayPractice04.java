package com.kh.practice05.func;

import java.util.Scanner;

public class ArrayPractice04 {

	public static void main(String[] args) {
		// 3 �̻��� Ȧ�� �ڿ����� �Է¹޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�, �߰� ���ĺ���
		// �������� 1�� �����Ͽ� ������������ ���� �־� ���. ��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ���,
		// "�ٽ� �Է��ϼ���." ����ϰ� �ٽ� ���� �ޱ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("3 �̻��� Ȧ�� �ڿ����� �Է����ּ���.");
		int num = sc.nextInt();
		
		if (num/2 != 0) {
			for (int i = 0; i > num; i++) {
				num += 1;
				System.out.println(i);
				}
		} else {
			System.out.println("�ٽ� �Է��ϼ���."); //�ʹ� ��ƴ�...
		}

	}

}
