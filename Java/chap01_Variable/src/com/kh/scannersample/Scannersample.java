package com.kh.scannersample;
import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է��� �ּ���.");
		int age = sc.nextInt(); //������ �޴� next
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		
		String name;
		String phonenumber;
		
		System.out.println("����� �̸��� �Է��ϼ���. : ");
		name = sc.next();
		System.out.println("����� ��ȣ�� �Է��ϼ���. : ");
		phonenumber = sc.next(); //-�����ʱ�
		
		System.out.print("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� ��ȭ��ȣ�� " + phonenumber + "�Դϴ�.");
		
		// �� ��̿� ���� �����ϴ� ���İ� �� �ּ� 1�� ����ϱ�
		String hobby;
		String favoriteFood;
		String address;
		
		System.out.println("����� ��̴� �����Դϱ�?");
		hobby = sc.next();
		System.out.println("����� �����ϴ� ������ �����Դϱ�?");
		favoriteFood = sc.next(); //sc.next();������ ���� ����. �ٿ����� �͸� ����.
		System.out.println("�ּҸ� �Է��� �ּ���.");
		address = sc.nextLine(); //sc.nextLine();���� ġ�� ������ ���.
		System.out.println("����� ��̴� " + hobby + "�Դϴ�. ����� �����ϴ� ������ " + favoriteFood + "�Դϴ�. ����� �ּҴ� " + address + " �Դϴ�." );
		
	}

}
