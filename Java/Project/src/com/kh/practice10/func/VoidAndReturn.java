package com.kh.practice10.func;

import java.util.Scanner;
/*
 * System.out.println();
 * void Ȱ��
 * return Ȱ��
 * static
 * */
public class VoidAndReturn {
	public void practice1() {
		//�� ���� �� ���
		 Scanner scanner = new Scanner(System.in);
	       
	        int num1 = scanner.nextInt();
	       
	        int num2 = scanner.nextInt();

	        int sum = num1 + num2;
	        
	        System.out.println("�� : " + sum);
	    }
	public void practice2() {
		Scanner scanner = new Scanner(System.in);
       
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.println(factorial);
        }
	    
	}
	public void practice3() {
		 Scanner scanner = new Scanner(System.in);
	       
	     String input = scanner.nextLine();

	     String reversed = new StringBuilder(input).reverse().toString();
	     
	     System.out.println(reversed);
	       
	}
	public void practice4() {
		Scanner scanner = new Scanner(System.in);
       
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;

       
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            System.out.println(sum);
        }
        
        
	}
	public void practice5() {
		Scanner scanner = new Scanner(System.in);
	       
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];

       
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            System.out.println(max);
        }
	        
	        
	}
	public void practice6() {
		Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        boolean isPrime = isPrimeNumber(num);
        
        if (isPrime) {
          System.out.println("�Ҽ��Դϴ�.");
        } else {
          System.out.println("�Ҽ��� �ƴմϴ�.");
        }
    }
    
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            System.out.println("�Ҽ��Դϴ�.");
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
            System.out.println("�Ҽ��� �ƴմϴ�.");
            }
        }
		return false;
        
        
	}
    
    public void practice7() {
    /*  ���� ����� (���� ��� ��ȯ):

    	�޼��� �̸�: calculate

    	�Ű�����: �� ���� �Ǽ�(double Ÿ��) num1�� num2, �׸��� ������(String Ÿ��) operator
    	���: num1�� num2�� operator�� ���� ���ϱ�, ����, ���ϱ�, ������ ������ �����ϰ� ����� ��ȯ��.
    */
    	double num1;
    	double num2;
    	String operator;

    }
    public void practice8() {
    /*
    	�ܾ� ���� ����:

    	�޼��� �̸�: countWords

    	�Ű�����: ���ڿ�(String Ÿ��) text
    	���: �Էµ� ���ڿ����� ������ �������� �ܾ��� ������ ���� ����� �����(void ���� Ÿ��).	
    */
    	String text;
    }
    public void practice9() {
    /*
    	�ﰢ�� �� ���:

    	�޼��� �̸�: printTriangle

    	�Ű�����: ���� ����(int Ÿ��) height
    	���: ���̰� height�� �ﰢ�� ����� ���� �����(void ���� Ÿ��).
    */

    }
    public void practice10() {
    /*
    	�ζ� ��ȣ ������:
    	Random
    	�޼��� �̸�: generateLottoNumbers

    	�Ű�����: �ζ� ��ȣ�� ����(int Ÿ��) count
    	���: �ߺ����� �ʴ� ������ �ζ� ��ȣ�� count��ŭ �����Ͽ� �����(void ���� Ÿ��).
    */

    }
}