package com.kh.practice03.func;

import java.util.Scanner;

public class IfPractice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������� �Է����ּ���.");
		int scoreOfKorean = sc.nextInt();
		System.out.println("���������� �Է����ּ���.");
		int scoreOfMath = sc.nextInt();
		System.out.println("���������� �Է����ּ���.");
		int scoreOfEnglish = sc.nextInt();
		
		if (scoreOfKorean >= 40 && scoreOfMath >= 40 && scoreOfEnglish >= 40 &&
				(((scoreOfKorean + scoreOfMath + scoreOfEnglish)/3 >= 60))) {
			System.out.println("�������� : " + scoreOfKorean + " �������� : " + scoreOfMath + 
					" �������� : " + scoreOfEnglish + " �հ� : " + (scoreOfKorean + scoreOfMath + scoreOfEnglish) +
					" ��� : " + (scoreOfKorean + scoreOfMath + scoreOfEnglish)/3 + " �����մϴ�! �հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		

	}

}