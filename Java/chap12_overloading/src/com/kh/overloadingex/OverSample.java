package com.kh.overloadingex;
//�ڹ����� ����� OverSample.java
//�����ε� 5�� ����� ���
public class OverSample {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
	public int div2(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		OverSample obj = new OverSample();
		
		System.out.println("���� : " + obj.add(10, 5));
		System.out.println("���� : " + obj.sub(10, 5));
		System.out.println("���� : " + obj.mul(10, 5));
		System.out.println("������ �� : " + obj.div(10, 5));
		System.out.println("������ ������ : " + obj.div2(10, 5));
	}

}
