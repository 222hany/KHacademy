package com.kh.pattern.mvc;
import com.kh.pattern.mvc.Controller.userController;
//MVC ������ ����ؼ� �л������� �ٷ�� ��
import com.kh.pattern.mvc.Model.userModel;
import com.kh.pattern.mvc.View.userView;

public class userClient {

	public static void main(String[] args) {
		// �� ��ü�� ����
		userModel user = new userModel("ȫ�浿", 20);
		
		// �� ��ü�� ����
		userView view = new userView();
		
		// ��Ʈ�ѷ� ��ü ���� �� �� �� ����
		userController controller = new userController(user, view);
		
		// ���� ������ ���
		controller.updateView();
		
		//���� ���� ������Ʈ
		//controller.setuserName("�̼���");
		//controller.setuserAge(30);
				
		//������Ʈ �� ���� ���� ���
		controller.updateView();
		
	}

}
