package com.kh.practice04.func;
 
import java.util.Scanner;

public class WhilePractice7 {

	public static void main(String[] args) {
		// ����ڷκ��� �Է¹��� ������ ���� �Է��ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
		int result = num * i;
		System.out.println(result);
	}
}

}
