package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		//String[] fruitArray = {"���", "����", "Ű��", "�޷�", "��"};
		//������� �ٳ���, ���⿡�� ����, Ű������ ����, �޷п��� ��, �ֿ��� ������.
		String[] fruitArray =  {"���", "����", "Ű��", "�޷�", "��"};
		fruitArray[0] = "�ٳ���";
		fruitArray[1] = "����";
		fruitArray[2] = "����";
		fruitArray[3] = "��";
		fruitArray[4] = "������";
		System.out.println("��� ��� : " + fruitArray[0]);
		System.out.println("���� ��� : " + fruitArray[1]);
		System.out.println("Ű�� ��� : " + fruitArray[2]);
		System.out.println("�޷� ��� : " + fruitArray[3]);
		System.out.println("�� ��� : " + fruitArray[4]);
	}

}
