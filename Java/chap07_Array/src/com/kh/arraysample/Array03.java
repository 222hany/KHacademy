package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/* ���ڿ��� �Է¹޾Ƽ� ���� �ϳ��ϳ� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������ �� ��°
		   �ε����� ��ġ�ϴ��� �ε��� ����ϱ�                                                    */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���.");
		String inputString = sc.next();
		
		System.out.println("�˻��� ���ڸ� �Է��ϼ���.");
		char searchChar = sc.next().charAt(0);
		
		char[] charString = inputString.toCharArray(); //toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
		int charCount = charString.length;
		System.out.println("charCount : " + charCount);
		
		int count = 0;
		System.out.println(inputString + " �� " + searchChar + " (��)�� �����ϴ� ��ġ(�ε���)");
		for (int i = 0; i < charCount; i++) {
			if(charString[i] == searchChar) { //charString[i] �������� �ƴ϶� i���� ������ searchChar ���� ����.
			System.out.println(i);
			}
		}
		
	}

}
