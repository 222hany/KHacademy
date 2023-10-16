package com.kh.ArrayListSample;

import java.util.ArrayList;

//ToDoSample.java
//ArrayList �̿��ؼ� �� �� 3��, ���� 2��, 1�� �����, ���� �� ����.
public class ToDoSample {

	public static void main(String[] args) {
		ArrayList<String> toDoList = new ArrayList<>();
		
		// �� �� 3�� �߰�
		toDoList.add("������ ��å�ϱ�");
		toDoList.add("������ ���� �ֱ�");
		toDoList.add("������ �� ���ٵ��");
		System.out.println("���� �� �� : " + toDoList);
		
		// �� �� 2�� �����ϱ�
		toDoList.set(0, "������ �������� ���ø��� ����");
		System.out.println("��ͼ� ��å�ϱ⸦ ���� : " + toDoList);
		toDoList.set(2, "������ ��汸 �Ͷ��� �����");
		System.out.println("�� ���ٵ�ٰ� �ʹ� �Ϳ����� ��ȹ �ٲٱ� : " + toDoList);
		
		// �� �� 1�� �����
		toDoList.remove(1);
		System.out.println("������ ���� �����ϱ� ����� : " + toDoList);
		
		// ArrayList ��ȸ�ؼ� ��� ���
		System.out.println("**************************");
		System.out.println("���ϴ��� To Do List");
		for (String list : toDoList) {
			System.out.println(list);
		}
		System.out.println("**************************");
		
		// ���� �� �����ϱ�
		toDoList.clear();
		System.out.println("��� �� �� ���´�! : " + toDoList);
		
	}

}
