package com.kh.practice06.func;

public class Product {
	// 1. ������� ����
	String pname;
	int price;
	String brand;
	
	// 2. ������ this�� Ȱ���ؼ� �����
	public Product(String pname, int price, String brand){
		this.pname = pname;
		this.price = price;
		this.brand = brand;
	}
		
	// 3. ���� ��� �޼ҵ� �����
	public void information() {
		System.out.println("��ǰ�� : " + pname);
		System.out.println("���� : " + price + "��");
		System.out.println("�귣�� : " + brand);
	}

}
