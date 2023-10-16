package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Controller.StudentController;
import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

public class StudentClient {
	
	public static void main(String[] args) {
		// 1. �𵨰�ü ���� Model
		StudentModel model = new StudentModel("���л�", 17);
		// 2. �� ��ü ���� View
		StudentView view = new StudentView();
		// 3. ��Ʈ�ѷ� ��ü ���� Controller(��, �� ����)
		StudentController controller = new StudentController(model, view);
		// 4. �л� ���� ������Ʈ & ���
		controller.updateView();
		// 5. �л� ���� ������Ʈ
		controller.setStudentName("������Ʈ");
		controller.setStudentAge(18);
		// 6. ������Ʈ �� �л����� ���
		controller.updateView();
	}

}
