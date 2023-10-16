package com.kh.goodExam.game;
// ���� ���ڸ��߱� ���� ��
public class GameModel {
	private int secretNumber; // ������ ��ȣ
	private int attempts;     // �� �� �õ��ߴ°�
	
	public GameModel() {
		secretNumber = (int)(Math.random() *100) + 1; // 1���� 100 ������ ������ ���� ����
		attempts = 0; // ���ʽõ��� 0��
	}
	public int getSecretNumber() {  // ��ǻ�Ͱ� �������� ������ ���� 1��
		return secretNumber;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
	public void incrementAttempts() {
		attempts++;
	}
	
	public boolean isCorrectGuess(int guess) {
		incrementAttempts();  // guess�� ���� �Է��߱� ������ ���� �żҵ带 �߰�
		return guess == secretNumber;
	}
}
