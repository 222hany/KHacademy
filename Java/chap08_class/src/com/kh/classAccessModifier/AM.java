package com.kh.classAccessModifier;

public class AM {
	public int pNum = 10;
	protected int pNum2 = 20;
	// default int pNum3 = 30; // ���������ڸ� ������� ������ �ڵ����� ����Ʈ
	int pNum3 = 30;
	private int pNum4 = 40;
	
	// ȣ�� �޼ҵ带 �ۼ��ؼ� ���� ȣ���ϱ�
	public void publicMethod() {
		System.out.println("���������� public");
	}
	
	protected void protectedMethod() {
		System.out.println("���������� protected");
	}
	/*
	default void defaultMethod() { // default�� �տ� ���������ڸ� �ۼ��� ���� ������ �⺻���� ������ ��.
		System.out.println("default Method() ȣ���");
	}
	*/
	void defaultMethod() {
		System.out.println("���������� default");
	}
	
	private void privateMethod() {
		System.out.println("���������� private");
	}
}
