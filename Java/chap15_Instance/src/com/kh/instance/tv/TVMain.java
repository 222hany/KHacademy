package com.kh.instance.tv;

public class TVMain {

	public static void main(String[] args) {
		TV tv;         // TV�� �ν��Ͻ��� �����ϱ� ���� ���� tv�� ����.
		tv = new TV(); // TV �ν��Ͻ� ����. ��ü�� �ּҸ� ���������� ����.
		
		tv.power();
		tv.channel = 7;   // TV �ν��Ͻ��� ������� channel�� ���� 7�� ����.
		tv.channelDown(); // TV �ν��Ͻ��� �żҵ� channelDown�� ȣ��.
		
		System.out.println("Channel : " + tv.channel);
	}

}
