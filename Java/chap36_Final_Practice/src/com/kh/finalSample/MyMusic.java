package com.kh.finalSample;

import java.util.ArrayList;

public class MyMusic {
	// ù ��° ���
	// Ŭ���� ���� ��ü �����ϰ� getter �����ϱ�.
	
	public void runMusic() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("�߶��", "����"));
		list.add(new Music("��", "�ų�"));
		list.add(new Music("��", "�ò�����"));
		
		for(int i = 0; i <= list.size(); i++) {
			System.out.println(list.get(i));
			
			// �� ��° ���
			Music m = list.get(i);
			System.out.println(m.getGenre() + ", " + m.getMood());
		}
	}
}
