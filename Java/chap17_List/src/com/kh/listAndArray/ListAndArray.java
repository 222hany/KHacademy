package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListArray1();
		ListArray2();
	}
		
		public static void ListArray1() {
		
		// Array ����
		int[] intArray = new int[2]; // ũ�Ⱑ 5�� ���� �迭 ����.
		intArray[0] = 1;
		intArray[1] = 2;
		//intArray[2] = 3; // ũ�⸦ �����صױ� ������ ����.
		
		// Array�� ���
		System.out.println("Array��� : ");
		for(int a = 0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		System.out.println(); // ���๮�� ���ԵǾ� �־� enter���� ����.
		
		// List ����
		List<Integer> intList = new ArrayList<>(); // Integer ��ü�� �����ϴ� ArrayList�� ����.
		intList.add(1);
		intList.add(2);
		intList.add(3); // ũ�Ⱑ �����Ǿ� ���� �ʱ⶧���� �󸶵��� �߰� ����.
		
		// List�� ���
		System.out.println("List��� : ");
		for(int num : intList) { // ���� for�� ���.
			System.out.println(num + " ");
		}
		}
		
		public static void ListArray2() {
		
		// String���� ���� �� Array�� List ���
		String[] strArray = new String[3];
		strArray[0] = "����";
		strArray[1] = "ü��";
		strArray[2] = "���";
		System.out.println("String Array : ");
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		
		System.out.println();
		
		List<String> strList = new ArrayList<>();
		strList.add("����");
		strList.add("�ڵ�");
		strList.add("����");
		System.out.println("String List : ");
		for(String str : strList) {
			System.out.print(str);
		}
		}

}
