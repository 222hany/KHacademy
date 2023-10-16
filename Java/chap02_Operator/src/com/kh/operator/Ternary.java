package com.kh.operator;

public class Ternary {

	public static void main(String[] args) {
		/* 6. ���׿�����(Ternary) : ������ ���ϰ� �� ���� �� �� �ϳ��� ��ȯ�Ѵ�.(���� ? ��1 : ��2) ���·� ���.
		                         ex)���̰� 20�̻��� �����ΰ� �̼������ΰ� (���� = ���� ? ���� : ����)    */
		int age = 20;
		//              (   ����   ) ? (��1=T)  (��2=F)
		String status = (age >= 20) ? "����" : "�̼�����";
		System.out.println(status);
		
		int score = 85;
		String result = (score >= 60) ? "�հ�" : "���հ�";
		System.out.println(result);
		
		int number = -5;
		String sign = (number > 0) ? "true" : "false";
		System.out.println(sign);
		
		int temperature = 25;
		String weather = (temperature > 21) ? "������ ����" : "�߿� ����";
		System.out.println(weather);
		
		//���� 7�� ���� ¦������ Ȧ������ ���
		int num = 7;
		String evenOrOdd = (num%2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(evenOrOdd);
		
		int num1 = -5;
		String sign2 = (num1 > 0) ? "���" : (num1 < 0) ? "����" : "0";
		System.out.println(sign2);
	}

}
