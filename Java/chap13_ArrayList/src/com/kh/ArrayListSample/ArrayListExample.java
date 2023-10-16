package com.kh.ArrayListSample;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// �� ArrayList ����
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println("fruits : " + fruits);
		
		// ��� �߰�
		fruits.add("���");
		System.out.println("��� �߰� : " + fruits);
		fruits.add("�ٳ���");
		System.out.println("�ٳ��� �߰� : " + fruits);
		fruits.add("����");
		System.out.println("���� �߰� : " + fruits);
		
		// ��� ���� Ȯ��
		int size = fruits.size();
		System.out.println("���� ����� ũ�� : " + size);
		
		// �ε����� ����Ͽ� ��ҿ� ����
		String firstFruit = fruits.get(0);
		System.out.println("ù ���� : " + firstFruit);
		
		// ��� ����
		fruits.set(2, "ü��");
		System.out.println("���⸦ ü���� ���� : " + fruits);
		
		// ��� ����
		fruits.remove(1);
		System.out.println("�ٳ��� ���� : " + fruits);
		
		// ArrayList ��ȸ�ؼ� ������
		System.out.println("��� ���� ���");
		for(String list : fruits) {
			System.out.println(list);
		}
		
		// Array ����
		fruits.clear();
		System.out.println("��� ���� ���� : " + fruits);
	}

}
