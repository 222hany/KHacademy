package com.kh.practice02.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�Ǽ������� ����,����,���� �� ������ ������ �Է¹޾� ������ ����� ����ϼ���.
		//�� �� ������ ����� ���������� ó���ϼ���.
		
		double korean, english, math;
		
		System.out.print("���������� �Է��� �ּ���.");
		korean = sc.nextDouble();
		System.out.print("���������� �Է��� �ּ���.");
		english = sc.nextDouble();
		System.out.print("���������� �Է��� �ּ���.");
		math = sc.nextDouble();
		
		//System.out.print("������ " + ((int)korean+(int)english+(int)math) + "�� �Դϴ�.");
		//System.out.print("����� " + (((int)korean+(int)english+(int)math)/3) + "�� �Դϴ�.");
		
		//������ Ǯ��
		int totalScore = (int) (korean+english+math);
		int averageScore = (int) (korean+english+math)/3;
		System.out.print("������ " + totalScore + "�� �Դϴ�. ");
	    System.out.print("����� " + averageScore + "�� �Դϴ�.");
		
		
	}

}