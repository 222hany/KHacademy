package com.kh.gettersetter;

public class PlayerCharacter {
	private String name; // ĳ���� �̸�
	private int health; // ü��
	private int attackPower; // ���ݷ�
	
	// getter ������ ���纻�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ����. ���� �����ʹ� ������.
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	// setter �ܺο��� �żҵ带 ���� �����Ϳ� ������ �ϰ� �ȴٸ� �żҵ�� �Ű���(�Ű�����)�� �����ؼ� ��ȿ�� ���� �����ͷ� ����.
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		if (health >= 1) { // ü���� 1���� Ŭ ���.
			this.health = health;
		} else {
			System.out.println("ü���� �����ϴ�...");
		}
		
	}
	public void setAttackPower(int attackPower) {
		if (attackPower >= 1) {
			this.attackPower = attackPower;	
		} else {
			this.attackPower = 0; // 0 �̸��� ���� �־ 0 ������ ���� ��µ��� ����.
			System.out.println("���ݷ��� �����մϴ�.");
		}
	}
	
	// ĳ���� ���� ���
	public void diplayInfo() {
		System.out.println("ĳ���� ���� : " + name);
		System.out.println("ü�� ���� : " + health);
		System.out.println("���ݷ� ���� : " + attackPower);
	}
	// ĳ���� �����ϴ� ��� �żҵ�
	public void attack() {
		System.out.println("���� �߽��ϴ�.");
	}
	// �ٸ� ĳ���ͷκ��� ���ݹ޾����� �żҵ�
	public void damage() {
		System.out.println("���� ���߽��ϴ�.");
	}
}
