package com.kh.example.practice3.model.vo;

public class CircleRun {

	public static void main(String[] args) {
		// �⺻ ������ ��ü ����
		Circle circle = new Circle();
				
		// �ʱ� ���� �ѷ��� ���̸� ����ϰ� ���
		System.out.println("�ʱ� ���� ����");
		circle.AreaOfCircle();				
		circle.SizeOfCircle();
				
		// ���� �ѷ��� ���̰� ������ 1�� ������ ���� ��� ���
		circle.IncrementRadius(); // �������� 1�� ������Ŵ
				
		System.out.println("�������� 1�� ������Ų �� ���� ����");
		circle.AreaOfCircle();
		circle.SizeOfCircle();

	}

}
