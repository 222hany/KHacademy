package com.kh.operator;

public class OperatorExam {

	public static void main(String[] args) {
	// 1. ���� ���� ������ : ���� 1�� ������Ų �� �� ���� �ٽ� ������ �Ҵ�.
	int i = 5;
	i = ++i;
	System.out.println(i);
	
	// 2. ���� ���� ������ : ������ ���� ���� ����� �� ���� 1�� ����. i�� ���� ���� ������ �Ҵ��ϰ�, �� �Ŀ� ������ ���� 1 ����.
    //                    ������ �Ҵ��� ���� ���̹Ƿ� ������ ������� �ʴ´�.
	
	int j = 5;
	j = j++;
	System.out.println(j);
	
	int a = 5;
	++a;
	System.out.println(a);
	
	int b = 5;
	b++;
	System.out.println(b);
	
	}
}
