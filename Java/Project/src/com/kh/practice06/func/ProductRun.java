package com.kh.practice06.func;

public class ProductRun {

	public static void main(String[] args) {
		// Product ���� 3�� �ϰ� ���� ��ǰ��, ����, �귣��� ���
		
		Product product1 = new Product("�����", 1000, "���");
		Product product2 = new Product("����������", 3000, "������");
		Product product3 = new Product("��ũ����", 1500, "�Ե�");
		
		System.out.println("Product ����");
		product1.information();
		System.out.println("Product ����");
		product2.information();
		System.out.println("Product ����");
		product3.information();
	}

}
