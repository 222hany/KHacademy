package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {
				{"Apple", "Banana", "Cherry"},
				{"Grape", "Orange", "Strawberry"},
				{"Kiwi", "Mango", "Pineapple"}
		};
		
		System.out.println("fruits.length : " + fruits.length);
		
		for (int i = 0; i < fruits.length; i++) {         // ù��° for���� ��
			for (int a = 0; a < fruits[i].length; a++) {  // �ι�° for���� ��
				System.out.println(fruits[i][a] + " ");
			}
		System.out.println(); // �������� �̵��� �� �ְ� enter�� ��� �żҵ� �Է�
		}
	}

}
