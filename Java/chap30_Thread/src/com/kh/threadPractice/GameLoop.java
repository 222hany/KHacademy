package com.kh.threadPractice;

import java.util.Random;

public class GameLoop implements Runnable{
	static boolean isGameOver = false;
	
	@Override
	public void run() {
		while(!isGameOver) {
			int randomValue = new Random().nextInt(10);
			System.out.println("������ ���� : " + randomValue);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}System.out.println("������ �����Ϸ��� enter�� �����ּ���.");
		}
	}
}
