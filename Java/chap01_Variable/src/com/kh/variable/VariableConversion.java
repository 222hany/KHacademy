package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		// 1.�ڵ�����ȯ (�Ͻ�������ȯ, ����������ȯ)
		int intNum = 100;
		System.out.println(intNum);
		long longNum = intNum; //int -> long �ڵ�����ȯ
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float -> double �ڵ�����ȯ
		
		// int -> long ����ȯ 2���� ����� ����ϱ�
		//1
		int no_1 = 93290182;
		long no_2 = no_1;
		System.out.println(no_2);
		//2
		int no_3 = 930224;
		long no_4 = no_3;
		System.out.println(no_4);
		// short -> int ����ȯ 1���� ����� ����ϱ�
		short no_5 = 917;
		int no_6 = no_5;
		System.out.println(no_6);
		// float -> double ����ȯ 1���� ����� ����ϱ�
		float no_7 = 9.17f;
		double no_8 = no_7;
		System.out.println(no_8);
		
		// 2.��������ȯ (���������ȯ)
		long largeLong = 123456789012345L;
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.println(largeInt); //long�� int�� ��������ȯ �� ��� ���� �����ȿ� ���� ������ �Ϻ� �����ʹ� �սǵȴ�.
		
		double largeDouble = 12345.6789;
		int intPart = (int) largeDouble;
		System.out.println(intPart); //�Ǽ��� ������ ��������ȯ �Ҷ��� �����κи� �����ȴ�.
		
		// ���ڿ� ���� ���� ����ȯ 2�� ���
		// ���ڴ� char charValue = 'Z'; -> int�� ����
		char charValue = 'Z';
		int intValue = charValue;
		System.out.println(intValue);
		char charValue1 = 'A';
		int intValue1 = charValue1;
		System.out.println(intValue1);
		// double -> int ����ȯ ��� 1��
		double number = 3.14;
		int number1 = (int)number;
		System.out.println(number1);
		// int -> short ����ȯ ��� 1��
		int number2 = 1234;
		short number3 = (short)number2;
		System.out.println(number3);
	}

}
