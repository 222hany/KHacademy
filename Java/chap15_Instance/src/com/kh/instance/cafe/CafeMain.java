package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe customer1 = new Cafe("������", 1, false);
		Cafe customer2 = new Cafe("����Ƽ", 2, true);
		Cafe customer3 = new Cafe("ī���", 1, true);
		
		customer1.makeCoffee();
		System.out.println("*******************************");
		customer2.makeCoffee();
		System.out.println("*******************************");
		customer3.makeCoffee();
	}

}
