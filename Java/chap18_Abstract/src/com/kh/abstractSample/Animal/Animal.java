package com.kh.abstractSample.Animal;

abstract class Animal {
	// �ʵ�
	private String name;
	// ������
	public Animal(String name) {
		this.name = name;
	}
	// �߻�żҵ� �����Ҹ� ��� void sound();
	abstract String sound();
	// �Ϲݸżҵ� �����̸� ��� void displayName();
	public void setDisplayName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return name;
	}
}
