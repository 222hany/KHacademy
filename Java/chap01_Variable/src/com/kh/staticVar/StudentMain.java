package com.kh.staticVar;

public class StudentMain {

	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("KH�л�1");
		System.out.println(stKim.serialNum);
		stKim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("KH�л�2");
		System.out.println("KH 1 : ");
		System.out.println(stKim.serialNum);
		System.out.println("KH 2 : ");
		System.out.println(khLee.serialNum);
	}

}
