package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		// List �������̽��� LinkedList ��ü Ȱ��
		List<String> linkedList = new LinkedList<>();
		// String ���ֱ�
		linkedList.add("������");
		linkedList.add("abc");
		linkedList.add("123");
		System.out.println("���� �� : " + linkedList);
		// ����
		linkedList.set(1, "�󸶹�");
		System.out.println("���� �� : " + linkedList);
		// ����
		linkedList.remove(2);
		// ���� ���
		System.out.println("���� �� : " + linkedList);
		
		// LinkedList ��ü new LinkedList ��ü Ȱ��
		List<Integer> intList = new LinkedList<>();
		// int ���ֱ�
		intList.add(1);
		intList.add(2);
		intList.add(3);
		System.out.println("���� �� : " + intList);
		// ����
		intList.set(2, 5);
		System.out.println("���� �� : " + intList);
		// ����
		intList.remove(1);
		// ���� ���
		System.out.println("���� �� : " + intList);
	}

}
