package com.kh.practice05.func;

import java.util.Scanner;

public class ArrayPractice05 {

	public static void main(String[] args) {
		// ����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ� ������ "@@@ġŲ ��ް���" ������ "@@@ġŲ�� ���� �޴��Դϴ�" ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("ġŲ�� �˻����ּ���");
		String chicken = sc.next();
		String[] menu = {"���߹ٻ��", "����޺�", "û�縶��", "�Ķ��̵�"};
		
		for (int i = 0; i < menu.length; i++) {
		if(chicken == menu[i]) {
			System.out.println(menu[i] + "��� ����.");
			} else {
			System.out.println(chicken + "�� ���� �޴��Դϴ�."); // �������...�Ф�
		}

	}
	}
}
