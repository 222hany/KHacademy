package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		/*
		// 1. �迭�� ���̸� ����
		int[] num = new int[10]; // ���̰� 10�� �迭�� ����.
		// 1~10 ������ �ݺ����� �̿��ؼ� ������� �迭 �ε����� ���� ��
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.println(num[i]);
		}
		// �� ���� ���
		for (int i = 1; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		//���̰� 10�� �迭�� ����. 1~10������ ���� �ݺ����� �̿��� �������� �迭 �ε����� ���� �� �� ���� ���.
		int[] num1 = new int[10];

		int value = 10; // num1.length = 10
		for (int i = 0; i < num1.length; i++) {
			num1[i] = value--;
			System.out.println(num1[i]);
		}
		*/
		
		//���̰� 5�� String �迭�� ����. ���,��,����,������,���ܷ� �ʱ�ȭ �� �� �迭 �ε����� Ȱ���Ͽ� ���� ���.
		String[] fruit = {"���", "��", "����", "������", "����"};
		int fruitLength = fruit.length;
		System.out.println(fruit[1]);

	}

}
