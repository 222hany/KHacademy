package com.kh.practice07.func;

import java.util.Scanner;

public class SnackRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴��� �������ּ���");
		System.out.println("menu");
		
		Snack snk = new Snack();
		// set �����ϱ�
		snk.setKind("��");
		snk.setName("����ũ");
		snk.setFlavor("��纣��");
		snk.setNumOf(1);
		snk.setPrice(15000);
		
		snk.information();
	}

}
