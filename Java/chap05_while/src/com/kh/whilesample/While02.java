package com.kh.whilesample;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*boolean isChoice = false;
		
		while (!isChoice) { // !�� ����Ͽ� true�� ǥ��
			System.out.println("������ �������ּ���.");
			
			int month = sc.nextInt();
			switch (month){
			   case 3: case 4: case 5: // ���̽� 3���� �ϳ��� ���̸� ���.
		    	   System.out.println(month + "���� ���Դϴ�.");
		    	   System.out.println("�̼������� �����ϼ���.");
		    	   isChoice = true; // �� !�� ������� ���� �������� ����ǰ� ������ ������ ����Ǳ� ������ true�� �ۼ����־�
		    	                    // !�� ���� false�� ������ while���� �������ش�.
		    	   break; //break�� case������ �����ϰ��� �ϴ°� ����� �� �� ���� ����Ѵ�.
		       case 6: case 7: case 8: 
		    	   System.out.println(month + "���� �����Դϴ�.");
		    	   break;
		       case 9: case 10: case 11: 
		    	   System.out.println(month + "���� �����Դϴ�.");
		    	   break;
		       case 12: case 1: case 2: 
		    	   System.out.println(month + "���� �ܿ��Դϴ�.");
		    	   break;
		       default :
		    	   System.out.println(month + "���� �߸��� ���Դϴ�.");
			}
		}*/
		// ���̸� �Է¹޾� ����(19~20) û�ҳ�(14~18) ���(10~13)�� �з��ϰ� ����ϱ�. (while, switch, case �̿�.)
		// �� ���� ���̴� �ٽ��Է��ϼ���.
		
		boolean isTrue = false;
		while (!isTrue) {
			System.out.println("���̸� �Է����ּ���.");
			int age = sc.nextInt();
			
			switch (age) {
			      case 19 : case 20 :
			    	  System.out.println("�����Դϴ�.");
			    	  isTrue = true;
			    	  break;
			      case 14 : case 15 : case 16 : case 17 : case 18 : 
			    	  System.out.println("û�ҳ��Դϴ�.");
			    	  isTrue = true;
			    	  break;
			      case 10 : case 11 : case 12 : case 13 : 
			    	  System.out.println("����Դϴ�.");
			    	  isTrue = true;
			    	  break;
			      default :
			    	  System.out.println("�߸��� �����Դϴ�. ���̸� �ٽ� �Է����ּ���.");
			    	  System.out.println("***********************************");
			}
		}
	}

}
