package chap06_for;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = sc.nextInt();
		
		int result = 0; // ���� ���� 0���� �ش�.
		for (int i = 0; i < num2; i++) { // for ������ ����ؼ� i ������ 0���� num2 �̸����� �ݺ�.
			                             // �� ������ �ι�° ������ num2 ��ŭ �ݺ�.
			result += num; // result ������ num1 ���� ����. num2��ŭ num1�� ���ϴ� ȿ���� ��.
		}
		System.out.println(num + "*" + num2 + " = " + result); // ���� ����� ���. �Է¹��� �� ���ڿ� ��� ����
		                                                       // ���ڿ��� �����ؼ� ���. 
	}

}