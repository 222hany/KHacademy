package com.kh.instance.tv;

public class TV { // TV ��ü
	// TV ����
	// TV�� �Ӽ�(�ʵ�)
	String color;  // TV����
	boolean power; // ��������
	int channel;   // ä��
	
	// TV�� ���(�żҵ�)
	public void power() {
		power = !power; // ��������
	}
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
}
