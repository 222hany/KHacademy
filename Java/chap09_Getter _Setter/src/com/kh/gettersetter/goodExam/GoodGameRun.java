package com.kh.gettersetter.goodExam;

public class GoodGameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		GoodPlayer player1 = new GoodPlayer();
		player1.setName("KH");
		player1.ValidName();
		player1.setHealth(-10); // -10 ü���� ����
		player1.ValidHealth();  // -10 (���� ���� �ڵ�)�� ���Ἲ���� (������ ������) ����
		player1.setAttackPower(-20);
		player1.ValidAttackPower();
		player1.displayInfo();
		
		// �÷��̾�2�� valid ����		
		GoodPlayer player2 = new GoodPlayer();
		player2.setName("");
		player2.ValidName();
		player2.setHealth(80);
		player2.ValidHealth();
		player2.setAttackPower(20);
		player2.ValidAttackPower();		
		player2.displayInfo();
				
		/*System.out.println("attack!!!! ��");
				
		player1.attack(player2);
		player2.attack(player1);*/

	}

}
