package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		// ArrayList ���� �� ��� �߰�
		ArrayList<String> pptnzPL = new ArrayList<>();
		pptnzPL.add("��");
		pptnzPL.add("���ĸ��� ��");
		pptnzPL.add("Freshman");
		
		// Iterator ����
		Iterator<String> iter = pptnzPL.iterator();
		
		// Iterator�� ����Ͽ� ��ҹݺ�
		while(iter.hasNext()) {
			String pptnz = iter.next();
			System.out.println(pptnz);
		}

	}

}
