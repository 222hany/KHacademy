package com.kh.mvc.person.mo;

public class PersonModel {
	private String name;
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//���࿡ �̸��� ��ĭ�̸� "��ĭ�Դϴ�." ���
	public void VaildName() {
		if (this.name == "") {
			this.name = "��ĭ�Դϴ�.";
		}
	}
	
	//getter
	public String getName() {
		return name;
	}
	
}
