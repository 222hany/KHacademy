package com.kh.superSample;

public class Child extends Parent{  // �ڽ��� �θ� ��ӹ���.
	
	//Child()  // ���������ڰ� ����Ʈ�� ���� �� ���� ��, public�� ������ ����.
	public Child() {  
		super();  // �θ�Ŭ������ �⺻�����ڸ� ȣ��.
		System.out.println("�ڽ�Ŭ������ �⺻������ �Դϴ�.");
	}
	
	public Child(String name) {
		super(name);  // �θ�Ŭ������ ���ڿ� �Ķ���� ������ ȣ��.
		System.out.println("�ڽ�Ŭ������ ���ڿ� �Ķ���� ������ �Դϴ�.");
	}
	
	public void display() {
		super.show();  // �θ�Ŭ������ show ��¸żҵ带 ȣ��.
		System.out.println("�ڽ�Ŭ������ ���÷��� �żҵ� �Դϴ�.");
	}
}
