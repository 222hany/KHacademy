package com.kh.practice05.func;

public class ArrayPractice03 {

	public static void main(String[] args) {
		// ����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ� �迭�� ũ�⸸ŭ ����ڰ� ���� ����
		// �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ. �׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ���.
		int[] array = new int [5];
		array[0] = 4;
		array[1] = -4;
		array[2] = 3;
		array[3] = -3;
		array[4] = 2;
		
		int sum = array[0]+array[1]+array[2]+array[3]+array[4];
		
		for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
		}
		System.out.println("���� : " + sum);

	}

}
