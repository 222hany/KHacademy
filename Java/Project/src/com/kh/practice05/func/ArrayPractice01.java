package com.kh.practice05.func;

import java.util.Scanner;

public class ArrayPractice01 {

	public static void main(String[] args) {
		// ����ڿ��� �Է¹��� ���� ������ŭ �迭ũ�⸦ �Ҵ��ϰ�, 1���� �Է¹��� ������ �迭�� �ʱ�ȭ �� �� ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ���.");
		int num = sc.nextInt();
		int[] numArray = new int[num];
		
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = i + 1;
			System.out.println(numArray[i]);
		}
		

	}

}
