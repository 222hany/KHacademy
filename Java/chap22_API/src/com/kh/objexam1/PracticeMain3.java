package com.kh.objexam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PracticeMain3 {

	public static void main(String[] args) {
		PracticeMain3 pm = new PracticeMain3();
		//pm.practice1();
		//pm.practice2();
		//pm.practice3();
		//pm.practice4();
		pm.practice5();
	}
	
	public void practice1() {
		// ��-��-��
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	
	public void practice2() {
		// ��-��-��
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}

	public void practice3() {
		// ��-��
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	
	public void practice4() {
		// ��-��
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	
	public void practice5() {
		// ��-��-��-����
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-(E)");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}

}