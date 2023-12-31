package com.kh.variable;

public class Variable {
	public static void main(String[] args) {
		// 1. 변수의 이름은 영문자와 숫자, 언더스코어(_), 달러($)로 구성할 수 있다.
		// 2. 변수 이름은 숫자로 시작할 수 없다.
		// 3. 변수 이름 사이에는 공백을 포함할 수 없다. (언어의 규칙으로 띄어쓰기는 무언가 새로 시작할 때 사용하기 때문에 사용하지 않는다.)
		// 4. 자바에서 미리 예약한 언어는 변수 이름으로 사용하지 못한다.
		
		// 1.실수형 (소수점이 있는 숫자 : float, double)
		float pie1 = 3.1432522432432523f; //뒤에 f나 F를 붙여준다.
		double pie2 = 3.1432522432432523;
		System.out.print("float : ");
		System.out.println(pie1);
		System.out.print("double : ");
		System.out.println(pie2);
		
		// 2.정수형 (byte, short, int, long)
		// byte : -128 ~ 127 까지 사용가능.
		// short : -32,768 ~ 32,767 까지 사용가능.
		// int : -2,147,483,648 ~ 2,147,483,647 까지 사용가능. (가장 많이 사용함.)
		// long : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 까지 사용가능.
		long lng = 2000L; //뒤에 l이나 L을 붙여준다.
		
		// 3.문자형 (String, char)
		// String : 자료형에 들어가지는 않으나(그렇기 때문에 String(대문자로 시작)으로 표현됨.) 기본적으로 사용됨. ""나, ''안에 글자를 작성할 것.
		String name = "안녕하세요";
		// char : 문자형 문자를 한 문자만 포함할 수 있음. ''안에 작성함.
		char chr1 = 'a';
		System.out.println(chr1);
		
		// 4.논리형 (boolean)
		// boolean은 true와 false를 표현한다.
		// 사용방법 : boolean bln = true; / false;
		boolean bln = true;
		boolean bln2 = false;
		System.out.println(bln);
		System.out.println(bln2);
		
		String name2 = "이하니";
		System.out.println("안녕하세요, 저는 " + name2 + " 입니다.");
		// 한번 타입을 선언한 변수는 재타입을 하지 않고 그대로 사용해도 된다.
		// 한번 선언한 타입을 다른 타입으로 재선언 할 수 없다.
		name2 = "이미혜";
		System.out.println("안녕하세요, 저는 " + name2 + " 입니다.");
		
		int age = 22;
		String baseball = "야구";
		System.out.println("안녕하세요, 저는 " + name2 + " 입니다.");
		System.out.println("저의 나이는 " + age + "살 이고,");
		System.out.println("저의 취미는 " + baseball + "입니다.");
		
		char grade = 'A';
		System.out.println("저의 성적은 " + grade + "입니다.");
	}
}
