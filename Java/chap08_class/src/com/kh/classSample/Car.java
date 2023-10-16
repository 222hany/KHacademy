package com.kh.classSample;

public class Car {
	// 1. ���� �ʵ� �������
	String brand;      //�귣��
	String model;      //��
	int speed;         //�ӵ�
	boolean engineOn;  //��������
	
	// ������� �ؿ��� ��� �żҵ�� ����
	// 2. ������ (�żҵ��� �Ѱ��� ����)
	public Car(String brand, String model) { //���� ���� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
		this.brand = brand;
		this.model = model;
		this.speed = 50;
		this.engineOn = true;
	}
	// ���� ���� �޼ҵ�
	public void startEngine() { 
		if(engineOn) { //���࿡ ������ true�� ���� �õ�
			System.out.println("������ �õ��մϴ�."); //��� �޼ҵ� �ۼ�
		} else { //false�� ������ �����ִ�
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
	}
	// ���� �޼ҵ�
	public void accelerate(int amount) {
    	if(engineOn) { //���࿡ ������ true�� ���� �ӵ��� �󸶴�
    		System.out.println("�ӵ� ���Դϴ�.");
    	} else //false�� ������ �����־� �ӵ��� �� �� ����
    		System.out.println("�ӵ��� �� �� �����ϴ�.");
    }
	

}
