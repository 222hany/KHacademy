package com.kh.Switch;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		/*
		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���.");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ī���");
		System.out.println("3. ���ν����");
		System.out.println("4. �׸�Ƽ��");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		       case 1 :
		    	   System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
		    	   break;
		       case 2 :
		    	   System.out.println("ī��� �ֹ��ϼ̽��ϴ�.");
		    	   break;
		       case 3 :
		    	   System.out.println("���ν���� �ֹ��ϼ̽��ϴ�.");
		    	   break;
		       case 4 :
		    	   System.out.println("�׸�Ƽ�� �ֹ��ϼ̽��ϴ�.");
		    	   break;
		       default :
		    	   System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
		}*/
		
		int choice;
		boolean isChoice = false; // while�� false�϶� ������ ����ǰ� true�϶� ����.
		while (!isChoice) { // ������ ���� ���� �ڵ� ����� �ݺ������� ����.
			System.out.println("���ڸ� �������ּ���.");
			System.out.println("1. �����");
			System.out.println("2. ���ڱ�");
			System.out.println("3. ������");
			System.out.println("4. ���ı�");
	    choice = sc.nextInt();
		
		switch (choice) {
		       case 1 :
		    	   System.out.println("������� �ֹ��ϼ̽��ϴ�.");
		    	   isChoice = true;
		    	   break;
		       case 2 :
		    	   System.out.println("���ڱ��� �ֹ��ϼ̽��ϴ�.");
		    	   isChoice = true;
		    	   break;
		       case 3 :
		    	   System.out.println("�������� �ֹ��ϼ̽��ϴ�.");
		    	   isChoice = true;
		    	   break;
		       case 4 :
		    	   System.out.println("���ı��� �ֹ��ϼ̽��ϴ�.");
		    	   isChoice = true;
		    	   break;
		       default :
		    	   System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
		}
		}
		
		
	}

}
