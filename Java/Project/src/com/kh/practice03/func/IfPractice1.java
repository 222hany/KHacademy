package com.kh.practice03.func;

import java.util.Scanner;

public class IfPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		int button = sc.nextInt();
		
		//switch�� Ǯ��
		/*switch (button) {
		       case 1 :
		    	   System.out.println("�Է� �޴��Դϴ�.");
		    	   break;
		       case 2 :
		    	   System.out.println("���� �޴��Դϴ�.");
		    	   break;
		       case 3 :
		    	   System.out.println("��ȸ �޴��Դϴ�.");
		    	   break;
		       case 4 :
		    	   System.out.println("���� �޴��Դϴ�.");
		    	   break;
		       case 7 :
		    	   System.out.println("���α׷��� ����˴ϴ�.");
		    	   break;
		       default :
		    	   System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");*/
		
		//if�� Ǯ��
		if (button == 1) {
			System.out.println("�Է�");
		} else if (button == 2) { //3.��ȸ 4.���� 7.����");
			System.out.println("����");
		} else if (button == 3) {
			System.out.println("��ȸ");
		} else if (button == 4) {
			System.out.println("����");
		} else if (button == 7) {//else�� �� ��� ������ ���� ���ϱ� ������ else if �� �����
			System.out.println("���α׷��� ����˴ϴ�.");
		} 
		
	}
}