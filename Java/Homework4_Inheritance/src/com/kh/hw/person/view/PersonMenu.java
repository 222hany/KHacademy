package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		System.out.println("�޴��� �����ϼ��� : 1.�л��޴� 2.����޴� 9.������");
		int menu = sc.nextInt();
	}
	
	public void studentMenu() {
		System.out.println("1.�л��߰� 2.�л����� 9.��������");
		int menu = sc.nextInt();
	}
	
	public void employeeMenu() {
		System.out.println("1.����߰� 2.������� 9.��������");
		int menu = sc.nextInt();
	}
	
	public void insertStudent() {
		
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
