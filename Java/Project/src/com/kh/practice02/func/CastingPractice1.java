package com.kh.practice02.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Ű����� ���� �ϳ��� �Է¹޾� �� ������ ���ڸ� ����ϼ���.
		System.out.print("���ڸ� �Է��� �ּ���.");
		
		char inputChar = sc.next().charAt(0);
		int changeChar = inputChar;
		System.out.print(changeChar);
	}

}
