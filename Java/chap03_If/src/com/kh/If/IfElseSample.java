package com.kh.If;

public class IfElseSample {

	public static void main(String[] args) {
		/* 2. if-else : ���α׷� ���ǿ� ���� �� ���� ���� �ٸ� �ڵ� ��� �� �ϳ��� �����ϴ� �����.
		                ���� if���� ������ ���̸� if ���� �ִ� ����� ����ǰ� ������ �����̸� else ����� ����ȴ�.
		                �̸� ���� �� ���� ��Ȳ�� ���� �ٸ� ������ ������ �� �ִ�.
		                if (����) { ������ ���϶� ����Ǵ� �ڵ�
		                } ������ �����϶� ����Ǵ� �ڵ�                                                */
		
		int age = 60;
		if (age >= 60) {System.out.println("ȯ����ġ�� �Ұž�.");}
		          else {System.out.println("���� �־���.");}
		
		int temp = 30;
		if (temp >= 25) {System.out.println("���� ���� ����˴ϴ�.");}
		           else {System.out.println("������ ������ ����˴ϴ�.");}
    }
}