package com.kh.overloadingex;

public class OverloadingExam {
	// 정수형 덧셈
	public int sum(int a, int b) {
		return a + b;
	}
	
	// 세 개의 정수형 덧셈
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	// 두 개의 실수형 덧셈
	public double sum(double a, double b) {
		return a + b;
	}
	public double sum(double a, double b, double c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		OverloadingExam obj = new OverloadingExam();
		
		//매소드 호출
		System.out.println("두 정수의 합 : " + obj.sum(10, 20));
		System.out.println("세 정수의 합 : " + obj.sum(10, 20, 30));
		System.out.println("두 실수의 합 : " + obj.sum(10.5, 10.5));
		System.out.println("세 실수의 합 : " + obj.sum(10.5, 10.5, 10.5));
	}
}
