package com.kh.practice04.func;

import java.util.Scanner;

public class WhilePractice5 {

	public static void main(String[] args) {
		// 1���� ����ڿ��� �Է� ���� �� ������ �������� ���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �ϳ� �Է��ϼ���.");
		int num = sc.nextInt();
		
		/*int sum = 0;
		int num2 = 1;
		
		while (num2 <= num1) {
			System.out.println(sum);
			sum += num2;
			num2 = num2 + 1;
		}*/
		
		//������ Ǯ��
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1���� " + num + "������ ���� " + sum + "�Դϴ�.");
}
}
