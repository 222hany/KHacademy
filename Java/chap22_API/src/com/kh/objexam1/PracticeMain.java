package com.kh.objexam1;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		// practice1();
		PracticeMain pm = new PracticeMain();
		pm.practice1();
	
	}	
	public void practice1() {
		// Scanner �̿��ؼ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڿ��� �Է��ϼ���");
		String str1 = sc.nextLine();
		System.out.println("�� ��° ���ڿ��� �Է��ϼ���");
		String str2 = sc.nextLine();
		
		sc.close();
		
		// ��ü ��
		if(str1.equals(str2)) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}

		// hashCode() �żҵ带 ����Ͽ� ��ü�� �ؽ��ڵ� ���
		int hashcode1 = str1.hashCode();
		int hashcode2 = str2.hashCode();
		System.out.println("str1�� �ؽ��ڵ� : " + hashcode1);
		System.out.println("str2�� �ؽ��ڵ� : " + hashcode2);
				
		// toString() �żҵ带 ����Ͽ� ��ü�� ���ڿ��� ǥ��
		String str1String = str1.toString();
		String str2String = str2.toString();
		System.out.println("str1�� ���ڿ� ǥ�� : " + str1String);
		System.out.println("str2�� ���ڿ� ǥ�� : " + str2String);
				
		// getClass() �żҵ带 ����Ͽ� ��ü�� Ŭ�������� ���
		Class<?> classOfstr1 = str1.getClass();
		Class<?> classOfstr2 = str2.getClass();
		System.out.println("str1 Ŭ���� : " + classOfstr1);
		System.out.println("str2 Ŭ���� : " + classOfstr2);

	}
	

}
