package com.kh.practice06.func;

public class Circle {
	// 1. ��� ���� (�ʵ�)
	Double pi = 3.14; 
	int radius = 1;
	
	// 2. ������ 
	public Circle() { // �⺻������, �ƹ��� �ʱ�ȭ�� �������� �ʴ´�.
	}
	
	// 3. �޼ҵ�
	public void incrementRadius() {
		radius++;
		System.out.println(radius);
	}
	public void getAreaOfCircle() {
		double area = pi * radius * radius;
		System.out.println("area : " + area);
	}
	public void getSizeOfCircle() {
		System.out.println("���� ������ : " + radius);
	}
}
