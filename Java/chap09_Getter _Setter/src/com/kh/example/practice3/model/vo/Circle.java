package com.kh.example.practice3.model.vo;

public class Circle {
	// ������� (�ʵ�)
	private double PI = 3.14;
	private int radius = 1;
		
	// �ʵ� ���纻
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	
	// ������
	public void setPI(double pI) {
		PI = pI;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// ��� �żҵ�
	public void IncrementRadius() {
		radius++;
	}
	public void AreaOfCircle() { 
		double area = PI * radius * radius;
		System.out.println("���� ���� : " + area);
		}
	public void SizeOfCircle() {
		System.out.println("���� ũ�� : " + radius);
	}
}
