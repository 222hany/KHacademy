package com.kh.practice01.func;
import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Ű����� ����,���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
		
		double width, height;
		System.out.print("������ ���̴�?");
		width = sc.nextDouble();
		System.out.print("������ ���̴�?");
		height = sc.nextDouble();
		
		//System.out.println("������ " + width*height + " �Դϴ�.");
		//System.out.println("�ѷ��� " + (width+height)*2 + " �Դϴ�.");
		
		//������ Ǯ��
		double area = width*height;
		double round = (width+height)*2;
		System.out.println("������ " + area + " �Դϴ�.");
		System.out.println("�ѷ��� " + round + " �Դϴ�.");
	}

}
