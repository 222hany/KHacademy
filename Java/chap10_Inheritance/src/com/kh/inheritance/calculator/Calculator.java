package com.kh.inheritance.calculator;

public class Calculator {
	// ����
	int num, num2;  // int�� �����. ��ü���� �ƴ�.
	
	// 1. ���ϱ�
	public int add() { // �Ķ����(�Ű�����) ���� 2�� �־��ֱ�
		return num + num2;
	}
	// 2. ����
	public int substruct() {
		return num - num2;
	}
	// 3. ���ϱ�
	public int multiply() {
		return num * num2;
	}
	// 4. ������
	public int divide() {
		return num / num2;
	}
}
