package com.kh.classCircle;

public class Circle {
	// ������� (�ʵ�)
	// private static final double PI = 3.14;
	// private final double PI = 3.14;
	// final double PI = 3.14; // ���� �� ��� ����.
    final double PI = 3.14; // ���
	private int radius = 1; // ����
	
	// ������
	public Circle() { // �⺻������
	}
	
	// �޼ҵ� / �������� ���� ���
	public void IncrementRadius() { //������ ����. ������ų ���� ����
		radius++;
	}
	
	public void AreaOfCircle() { // ���� ���̸� ����ϰ� ����ϴ� �żҵ�
	double area = PI * radius * radius;
	System.out.println("���� ���� : " + area);
	}
	
	public void SizeOfCircle() {
		System.out.println("���� ũ�� : " + radius);
	}
}
