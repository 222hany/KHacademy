package com.kh.objexam1;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm = new PracticeMain2();
		//pm.practice1();
		//pm.practice2();
		//pm.practice3();
		//pm.practice4();
		pm.practice5();
	}
	
	public void practice1() {
		// ���ڿ� �����̱� ��� append
		StringBuffer sb = new StringBuffer();
		sb.append("���� ");
		sb.append("���� ������");
		System.out.println(sb.toString());
	}
	
	public void practice2() {
		// ���ڿ� ������ reverse
		StringBuffer sb = new StringBuffer();
		sb.append("���� ���� ������");
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public void practice3() {
		// ���� insert
		StringBuffer sb = new StringBuffer();
		sb.append("���� ���� ������?");
		sb.insert(10, "����");
		System.out.println(sb.toString());
	}
	
	public void practice4() {
		// ��ü replace
		StringBuffer sb = new StringBuffer();
		sb.append("���� ���� ������?����");
		sb.replace(10, 12, ",,");
		System.out.println(sb.toString());
	}
	
	public void practice5() {
		// ���� delete
		StringBuffer sb = new StringBuffer();
		sb.append("���� ���� ������?,,");
		sb.delete(10, 12);
		System.out.println(sb.toString());
	}

}
