package com.kh.If;

public class IfSample {

	public static void main(String[] args) {
		/* 조건문 : if, else if, else 등의 문장을 사용해서 조건에 따라 다른 코드블록 실행.
		          주어진 조건을 평가하고, 참일 경우 특정 코드 실행. 거짓일 경우 다른 코드 실행.*/
		
		// 1. if(조건문){참이면 실행.
		//    }거짓이면 종료.                                                       
		
		int money = 300;
		if (money > 200) {
			System.out.println("저금");
		}
		
		int age = 18;
		if (age >= 18) {
			System.out.println("성인입니다.");
		}
		
		int temp = 25;
		if (temp > 24) {
			System.out.println("날씨가 춥지 않고 놀러가기 좋습니다.");
		}
		System.out.println("이상입니다. 뉴스였습니다.");
	}

}
