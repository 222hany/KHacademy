package com.kh.operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		/* 3. ����������(Increment & Decrement) : ������ ���� 1�� ������Ű�ų� ���ҽ�ų�� �����.
		   ���� ���� ������(++x, --x) ���� ���� ������(x++, x--)
		   
		   1-1)���� ���� ������ : ++ ���� ���� 1�� ���Ѵ�.
		                     val = ++num; : num�� ���� 1 ������ �� val ������ ����
		                     val = --num; : num�� ���� 1 ������ �� val ������ ���� */
		int val;
		int num1 = 10;
		val = ++num1; //num�� ���� 1 ������ �� ������ ������ �ϱ� ������ 11�� ��µ�.
		System.out.println(val);
		val = --num1; //num�� ���� 1 ������ �� ������ ������ �ϱ� ������ 10�� ��µ�.
		System.out.println(val);
		
		// 1-2)���� ���� ������ : ++ ���� ���� 1�� ���Ѵ�.
		int val2;
		int num2 = 10;
		System.out.println(num2);
		val2 = num2++; //val2 ������ ���� num2���� ������ �� num2�� 1 ����.
		//1.val2 = num2 �� �߰�.
		//2.num2 ++1 �߰� = num2
		System.out.println(val2);
		System.out.println(num2);
		
		val2 = num2--;
		System.out.println(val2);
		System.out.println(num2);
	}

}
