package com.kh.scannersample;
import java.util.Scanner;

public class Scannerexam {
	public static void main(String[] args) {
		// Ű���忡�� ���� �� ���� �Է¹޾�, �� ���� ��, ��, ��, ������ �� ��� �������� ����Ͻÿ�.
		int inum1 = 30;
		int inum2 = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		int inum3, inum4;
		inum3 = sc.nextInt();
		System.out.println("�� �ٸ� ������ �Է��ϼ���.");
		inum4 = sc.nextInt();
		
		System.out.println(inum3 + inum4);
	}

}
