package com.kh.gettersetter.goodExam;

public class GoodPlayer {
	
		private String name;   		//ĳ�����̸�
		private   int  health; 		//ü��
		private   int  attackPower; //�����Ŀ�
		
		
		public void setName(String name) {  // �̸��� ����Ǹ� ���� �� set
			this.name = name;
		}
		public void ValidName() {  // ĳ���� �̸��� ������ �ִ��� ����
			if (this.name == "") {
				this.name = "No name";
				//System.out.println("�̸��� ���� �ʾҽ��ϴ�.");
			}
		}
		public String getName() {  // ĳ���� �̸��� ��ȯ
			return name;
		}
		
		
		public void setHealth(int health) {
			this.health = health;
		}
		public void ValidHealth() {
			if (this.health <= 0) {
				this.health = 0;
				//System.out.println("ü���� �����ϴ�...");
			}
		}
		public int getHealth() {
			return health;
		}
		
		
		public void setAttackPower(int attackPower) {
			this.attackPower = attackPower;
		}
		public void ValidAttackPower() {
			if (this.attackPower <= 0) {
				this.attackPower = 0;
				//System.out.println("���ݷ��� �����մϴ�...");
			}
		}
		public int getAttackPower() {
			return attackPower;
		}
		
		
		public void displayInfo () {  // ��� �żҵ� �ۼ�
			System.out.println("ĳ���� ���� : " + this.name);
			System.out.println("ü�� ���� : " + this.health);
			System.out.println("���ݷ� ���� : " + this.attackPower);
		}
		
}
