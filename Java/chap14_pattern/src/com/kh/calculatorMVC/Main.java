package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		// Model View Controller ��������
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);
		
		// ��Ʈ�ѷ� ����
		controller.run();
	}

}
