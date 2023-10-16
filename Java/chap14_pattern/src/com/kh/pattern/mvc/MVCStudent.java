package com.kh.pattern.mvc;

public class MVCStudent {
	// 1. Model -> ������ getter setter
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public MVCStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 2. Controller -> ��� �żҵ�
	public class SController {
		private MVCStudent model;
		private MVCStudent view;
		
	public SController() {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.printinfo();
	}
	}
	
	// 3. view -> �������� ��(�ý�������Ʈ)
	public void printinfo() {
		System.out.println("�л����� ����");
	}
	
	// etc. Client
	public static void main(String[] args) {
	}

}
