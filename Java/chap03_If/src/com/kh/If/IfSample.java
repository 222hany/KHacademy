package com.kh.If;

public class IfSample {

	public static void main(String[] args) {
		/* ���ǹ� : if, else if, else ���� ������ ����ؼ� ���ǿ� ���� �ٸ� �ڵ��� ����.
		          �־��� ������ ���ϰ�, ���� ��� Ư�� �ڵ� ����. ������ ��� �ٸ� �ڵ� ����.*/
		
		// 1. if(���ǹ�){���̸� ����.
		//    }�����̸� ����.                                                       
		
		int money = 300;
		if (money > 200) {
			System.out.println("����");
		}
		
		int age = 18;
		if (age >= 18) {
			System.out.println("�����Դϴ�.");
		}
		
		int temp = 25;
		if (temp > 24) {
			System.out.println("������ ���� �ʰ� ����� �����ϴ�.");
		}
		System.out.println("�̻��Դϴ�. ���������ϴ�.");
	}

}
