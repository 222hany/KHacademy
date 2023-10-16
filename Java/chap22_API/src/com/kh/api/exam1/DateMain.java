package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
// Date : ��¥�� �ð������� ��Ÿ���µ� ���. java1.1 ���� ������ ����.
// java.time ��Ű�� LocalDate LocalTime LocalDateTime
	public static void main(String[] args) {
		/*
		// import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("LocalDate : " + currentDate);
		
		// LocalTime
		LocalTime currentTime = LocalTime.now();
		System.out.println("LocalTime : " + currentTime);
		
		// LocalDateTime
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime" + currentDateTime);
		
		// ��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7���� : " + futureDate);
		
		
		// minus, plus ���� 2���� �����
		LocalDate now = LocalDate.now();
		System.out.println("���� ��¥ : " + now);
		LocalDate couponExp1 = now.plusDays(2);
		LocalDate couponExp2 = now.plusDays(4);
		System.out.println("�����Ҹ꿹�� : " + couponExp1);
		System.out.println("�����Ҹ꿹�� : " + couponExp2);
		
		LocalDate update = now.minusDays(2);
		LocalDate update2 = now.minusDays(4);
		System.out.println("������ ������Ʈ�� : " + update);
		System.out.println("������ ������Ʈ�� : " + update2);
		*/
		
		// Ư�� ��¥ �ð� ����
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 13);
		
		// ��¥ ��
		if(date1.isBefore(date2)) {
			System.out.println(date2 + " �� �̷�");
		} else if(date1.isAfter(date2)) {
			System.out.println(date2 + "�� ����");
		} else {
			System.out.println(date1 + " �� " + date2 + " �� ������");
		}
		
	}

}
