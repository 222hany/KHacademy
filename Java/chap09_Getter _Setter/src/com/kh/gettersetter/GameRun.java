package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		PlayerCharacter player1 = new PlayerCharacter();
		
		player1.setName("������");
		player1.setHealth(-10);
		player1.setAttackPower(-20);
		
		player1.diplayInfo();
	}

}
