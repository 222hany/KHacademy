package com.kh.practice08.func;

import java.util.ArrayList;

public class ArrayListPractice01 {

	public static void main(String[] args) {
		// 1. �� ArrayList ����
		ArrayList<String> rainbow = new ArrayList<>();
		
		// 2. ��� �߰��ϱ�
		rainbow.add("red");
		rainbow.add("orange");
		rainbow.add("yellow");
		rainbow.add("green");
		rainbow.add("blue");
		rainbow.add("indigo");
		rainbow.add("violet");
		System.out.println("rainbow : " + rainbow);
		
		// 3. ��� �����ϱ�
		rainbow.set(1, "black");
		rainbow.set(3, "brown");
		rainbow.set(5, "green");
		System.out.println("���� üũ : " + rainbow);
		
		// 4. ��� �߰�
		rainbow.set(2, "yellow");
		rainbow.set(5, "light blue");
		System.out.println("�߰� üũ : " + rainbow);
		
		
		// 5. ���� �����
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		System.out.println("���� Ȯ�� : " + rainbow);
		
		// ������ Ǯ�� (�ε��� �̿��ؼ� ���)
	    //System.out.println("�ε����� ��� : " + rainbow.get(0) + rainbow.get(1) + rainbow.get(2));


		 //6. ���� for�� �̿��ؼ� ���� ����ϱ� -> red,blue,violet
		for (String colors : rainbow) {
			System.out.println(colors);
		}
	}
}
