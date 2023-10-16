package com.kh.threadMain;

import java.io.IOException;
import java.util.Random;

public class SimpleGame {
	private static boolean isGameOver = false;
	public static void main(String[] args) {
		// �ܺ� Ŭ������ �ν��Ͻ� ����
		SimpleGame s = new SimpleGame();
		
		// ���� ���� ������ ����
		Thread gameThread = new Thread(new GameLoop());
		gameThread.start();
		
		// ���� ���� ���� : �÷��̾ enterŰ�� ������
		try {
			System.in.read(); // ����ڰ� Ű����� �Է��� ����Ʈ�� ����. ����ڰ� enterŰ�� ���� �� ���� ���α׷� �Ͻ�����.
			isGameOver = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	 class GameLoop implements Runnable{
		private static boolean isGameOver = false;
		
		@Override
		public void run() {
			while(!isGameOver) {
				// ���� ���� ����
				int randomValue = new Random().nextInt(10); // ������ ���� ����
				System.out.println("������ ���� : " + randomValue);
				
				// ���� ���� ���� �ð�
				try {
					Thread.sleep(1000); // 1�� ���
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// ���� ���� ���� : �÷��̾ enterŰ�� ������
				System.out.println("������ �����Ϸ��� enter�� �����ּ���.");
			}
		}
	}
