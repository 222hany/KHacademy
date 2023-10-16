package com.kh.If;

public class IfElseIfSample {

	public static void main(String[] args) {
		/* if-else if-else : �������� ������ ���������� ��. �� �� ù��° ���� ���ǿ� �ش��ϴ� �ڵ� ����� �����ϴ� ����.
		                     ���� if�� else if�� ���ǵ� ���� �ƴ϶�� ������ else ��� ����.
		                     if(����1){
		                     ����1�� ���� �� ����Ǵ� �ڵ�
		                     } else if(����2){
		                     ����2�� ���� �� ����Ǵ� �ڵ�
		                     } else{
		                     ���� ��� ������ ������ �� ����Ǵ� �ڵ�
		                     }                                                                      */
		
		int age = 20;
		if (age == 20) {
			System.out.println("�ؿܿ����� ���ž�.");
		} else if (age >= 20) {
			System.out.println("���迩���� ���ž�.");
		} else {
			System.out.println("���� �����ž�.");
		}
		
		int score = 85;
		if (score >= 90) {
			System.out.println("A");
		} else if (score == 90) {
			System.out.println("B+");
		} else {
			System.out.println("B");
		}
		
		int hour = 15;
		if (hour < 12) {
			System.out.println("���� ���� ���� �ð��Դϴ�.");
		} else if (hour < 18) {
			System.out.println("���� ���� ���� �ð��Դϴ�.");
		} else {
			System.out.println("���Դϴ�. ������������.");
		}
		
		int temp = 28;
		if (temp > 30) {
			System.out.println("���� �����Դϴ�.");
		} else if (temp > 20) {
			System.out.println("������ �����Դϴ�.");
		} else {
			System.out.println("�ҽ��� ���� �Դϴ�.");
		}
		
		int num = -5;
		if (num > 0) { //0���� Ŭ �� ��.
			System.out.println("����Դϴ�.");
		} else if (num < 0) { //0���� ���� �� ��.
			System.out.println("�����Դϴ�.");
		} else { //0�϶� ��.
			System.out.println("0 �Դϴ�.");
		}
		
		int myAge = 15;
		if (myAge > 12) {
			System.out.println("û�ҳ� �Դϴ�.");
		} else if (myAge > 18) {
			System.out.println("���� �Դϴ�.");
		} else {
			System.out.println("��� �Դϴ�.");
		}
		
		int month = 8;
		if (month == 1 || month == 2 || month == 12) { // 1��, 2��, 12��
			System.out.println("�ܿ�");
		} else if (month >= 3 && month <= 5) { // 3�� ~ 5��
			System.out.println("��");
		} else if (month >= 6 && month <= 8) { // 6�� ~ 8��
			System.out.println("����");
		} else { // 9�� ~ 11��
			System.out.println("����");
		}
	}

}
