package com.kh.scannersample;
import java.util.Scanner;

public class Scannerexam {
	public static void main(String[] args) {
		// 키보드에서 정수 두 개를 입력받아, 두 수의 합, 차, 곱, 나누기 한 몫과 나머지를 출력하시오.
		int inum1 = 30;
		int inum2 = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		int inum3, inum4;
		inum3 = sc.nextInt();
		System.out.println("또 다른 정수를 입력하세요.");
		inum4 = sc.nextInt();
		
		System.out.println(inum3 + inum4);
	}

}
