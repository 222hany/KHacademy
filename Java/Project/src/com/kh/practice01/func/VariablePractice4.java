package com.kh.practice01.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���� ���ڿ� ���� Ű����� �Է¹޾� ���ڿ��� �տ��� ������ ����ϼ���.
		
		System.out.print("���ڿ��� �Է��ϼ���");
		String word = sc.next();
		
		System.out.println("ù��° �ܾ�� " + word.charAt(0) + "�Դϴ�.");
		System.out.println("�ι�° �ܾ�� " + word.charAt(1) + "�Դϴ�.");
		System.out.println("����° �ܾ�� " + word.charAt(2) + "�Դϴ�.");
		
		//������Ǯ�� (String���� �ϴ¹�)
		String letter = word.substring(4);
		System.out.println(letter);
	}

}
