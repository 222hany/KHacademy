package com.kh.abstractSample;
// �߻�Ŭ���� ����
abstract class Shape {
	// �Ϲ��ʵ�
	private String color;
	
	// �߻�żҵ�(���� Ŭ�������� �����ؾ� ��)
	abstract double calculateArea();
	abstract int recArea();
	
	// ������
	public Shape(String color) {
		this.color = color;
	}
	
	// �Ϲݸżҵ�
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
