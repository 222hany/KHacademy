package com.kh.goodExam.game;

public class GameView {
	private String startMsg = "���� ���߱� ������ �����մϴ�~";
	private String guessMsg = "1���� 100 ������ ���ڸ� ���纸����!";
	
	public void displayMessage() {
		System.out.println(startMsg);
		System.out.println(guessMsg);
	}
	// 1. ���� �����ϴ� �� �Է��ϱ�
	private String insertNumMsg = "������ ���ڸ� �Է��ϼ���.";
	
	public void diplayGuessPrompt() {
		System.out.println(insertNumMsg);
	}
	
	// 2. ������� Ʋ�ȴ���
	private String correctMsg = "���ڸ� ������ϴ�!";
	private String incorrectMsg = "���ڸ� Ʋ�Ƚ��ϴ�! �ٽ� �õ��ϼ���~";
	
	public void displayCorrectGuess() {
		System.out.println(correctMsg);
	}
	
	public void displayIncorrectGuess() {
		System.out.println(incorrectMsg);
	}
	
	// 3. �õ�Ƚ��
	public void displayAttmepts(int attempts) {
		System.out.println("�õ�Ƚ�� : " + attempts);
	}
	
	// 4. ��������
	private String ggMsg = "���� ����";
	
	public void displayGameOver() {
		System.out.println(ggMsg);
	}
}
