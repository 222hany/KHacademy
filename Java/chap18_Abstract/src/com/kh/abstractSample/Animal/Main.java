package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("������");
		System.out.println("���� �̸� : " + dog.getDisplayName());
		System.out.println("���� �Ҹ� : " + dog.sound());
		
		Cat cat = new Cat("�����");
		System.out.println("���� �̸� : " + cat.getDisplayName());
		System.out.println("���� �Ҹ� : " + cat.sound());
		
		// ��ü�迭�� Animal �����ؼ� ���. ������ Ȱ��.
		Animal[] animal = new Animal[2];
		animal[0] = new Dog("������");
		animal[1] = new Cat("�����");
		for(int i = 0; i < animal.length; i++) {
			System.out.println(animal[i].getDisplayName());
		}
		// �� �꿡�� �ܾ����..
	}

}
