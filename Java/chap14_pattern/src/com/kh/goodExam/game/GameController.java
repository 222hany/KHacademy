package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		// 1. ���� �޼���
		view.displayMessage();
		
		// 2. ��ĳ�ʷ� �Է� �� ȣ��
		Scanner sc = new Scanner(System.in);
		
		// 3. ��ǻ�Ͱ� ������ ���ڸ� ������ ��
		while(true) { // false�� �� �� ���� �ݺ�
			view.diplayGuessPrompt();
			int guess = sc.nextInt();
			
			if(model.isCorrectGuess(guess)) {
			view.displayCorrectGuess();	
			view.displayAttmepts(model.getAttempts());
				break;
			} else {
		
		// 4. ��ǻ�Ͱ� ������ ���ڸ� Ʋ���� ��
			view.displayIncorrectGuess();
			view.displayAttmepts(model.getAttempts());
			}
		}
		
		// 5. ��������
		view.displayGameOver();
	}
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m, v);
		
		c.runGame();
	}
}
