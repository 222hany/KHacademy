package com.kh.practice01.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//영어 문자열 값을 키보드로 입력받아 문자에서 앞에서 세개를 출력하세요.
		
		System.out.print("문자열을 입력하세요");
		String word = sc.next();
		
		System.out.println("첫번째 단어는 " + word.charAt(0) + "입니다.");
		System.out.println("두번째 단어는 " + word.charAt(1) + "입니다.");
		System.out.println("세번째 단어는 " + word.charAt(2) + "입니다.");
		
		//선생님풀이 (String으로 하는법)
		String letter = word.substring(4);
		System.out.println(letter);
	}

}
