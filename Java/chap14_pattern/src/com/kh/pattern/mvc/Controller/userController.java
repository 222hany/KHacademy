package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.userModel;
import com.kh.pattern.mvc.View.userView;

// �𵨰� �並 �����ϴ� ��
// ����� �Է��� ó���ϴ� ��

public class userController {
	private userModel usermodel; // ����Ʈ ��Ű��
	private userView userview;
	
	public void setUsermodel(userModel usermodel) {
		this.usermodel = usermodel;
	}
	public void setUserview(userView userview) {
		this.userview = userview;
	}
	
	
	public userModel getUsermodel() {
		return usermodel;
	}
	public userView getUserview() {
		return userview;
	}
	
	public userController(userModel model, userView view) {
		this.usermodel = model;
		this.userview = view;
	}
	
	public void updateView() {
		userview.displayInfo(usermodel.getName(), usermodel.getAge());
	}
	
	public static void main(String[] args) {
	}

}
