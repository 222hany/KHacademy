package com.kh.parctice;

import java.util.ArrayList;
import java.util.List;

public class CompareStudent {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("���ϴ�", 20));
		students.add(new Student("������", 22));
		students.add(new Student("�����", 22));
		
		for(Student std : students) {
			System.out.println(std);
		}
	}
}
