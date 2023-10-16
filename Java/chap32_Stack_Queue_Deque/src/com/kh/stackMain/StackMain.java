package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// push() : ���ÿ� �� �߰�
		stack.push(1); // |       |
		stack.push(2); // |   3   |
		stack.push(3); // |   2   | 
					   // |___1___|

		// pop() : ���� �� ����
		System.out.println(stack.pop()); //3
		System.out.println(stack.pop()); //2
		// clear() : ���� ��ü �� ����(�ʱ�ȭ)
		stack.clear();
		// peek() : ���� ���� ����� �� ���(���� �������� ���� ��)
		stack.peek();
		// ���� ũ�� ���
		stack.size();
		// ���� ���� Ȯ��(��������� true, �ϳ��� ����ִٸ� false)
		stack.empty();
		// ���ÿ� 1�� �ִ��� Ȯ��(1�� ������ true, ������ false)
		stack.contains(1);
	}

}
