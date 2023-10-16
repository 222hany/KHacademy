package com.kh.variable;

public class Variable {
	public static void main(String[] args) {
		// 1. ������ �̸��� �����ڿ� ����, ������ھ�(_), �޷�($)�� ������ �� �ִ�.
		// 2. ���� �̸��� ���ڷ� ������ �� ����.
		// 3. ���� �̸� ���̿��� ������ ������ �� ����. (����� ��Ģ���� ����� ���� ���� ������ �� ����ϱ� ������ ������� �ʴ´�.)
		// 4. �ڹٿ��� �̸� ������ ���� ���� �̸����� ������� ���Ѵ�.
		
		// 1.�Ǽ��� (�Ҽ����� �ִ� ���� : float, double)
		float pie1 = 3.1432522432432523f; //�ڿ� f�� F�� �ٿ��ش�.
		double pie2 = 3.1432522432432523;
		System.out.print("float : ");
		System.out.println(pie1);
		System.out.print("double : ");
		System.out.println(pie2);
		
		// 2.������ (byte, short, int, long)
		// byte : -128 ~ 127 ���� ��밡��.
		// short : -32,768 ~ 32,767 ���� ��밡��.
		// int : -2,147,483,648 ~ 2,147,483,647 ���� ��밡��. (���� ���� �����.)
		// long : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 ���� ��밡��.
		long lng = 2000L; //�ڿ� l�̳� L�� �ٿ��ش�.
		
		// 3.������ (String, char)
		// String : �ڷ����� ������ ������(�׷��� ������ String(�빮�ڷ� ����)���� ǥ����.) �⺻������ ����. ""��, ''�ȿ� ���ڸ� �ۼ��� ��.
		String name = "�ȳ��ϼ���";
		// char : ������ ���ڸ� �� ���ڸ� ������ �� ����. ''�ȿ� �ۼ���.
		char chr1 = 'a';
		System.out.println(chr1);
		
		// 4.���� (boolean)
		// boolean�� true�� false�� ǥ���Ѵ�.
		// ����� : boolean bln = true; / false;
		boolean bln = true;
		boolean bln2 = false;
		System.out.println(bln);
		System.out.println(bln2);
		
		String name2 = "���ϴ�";
		System.out.println("�ȳ��ϼ���, ���� " + name2 + " �Դϴ�.");
		// �ѹ� Ÿ���� ������ ������ ��Ÿ���� ���� �ʰ� �״�� ����ص� �ȴ�.
		// �ѹ� ������ Ÿ���� �ٸ� Ÿ������ �缱�� �� �� ����.
		name2 = "�̹���";
		System.out.println("�ȳ��ϼ���, ���� " + name2 + " �Դϴ�.");
		
		int age = 22;
		String baseball = "�߱�";
		System.out.println("�ȳ��ϼ���, ���� " + name2 + " �Դϴ�.");
		System.out.println("���� ���̴� " + age + "�� �̰�,");
		System.out.println("���� ��̴� " + baseball + "�Դϴ�.");
		
		char grade = 'A';
		System.out.println("���� ������ " + grade + "�Դϴ�.");
	}
}
