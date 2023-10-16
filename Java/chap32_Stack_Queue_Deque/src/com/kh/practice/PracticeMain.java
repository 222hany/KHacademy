package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//pm.PracticeStack();
		pm.PracticeQueue();
	}
	
	public void PracticeStack() {
		// stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �ż��� ����غ���
		Stack<String> stack = new Stack<>();
				
		// �� ����
		stack.push("���ϴ�");
		stack.push("���Ѽ�");
		stack.push("���Ѻ�");
		stack.push("������");
		stack.push("�̰���");
				
		// ũ�� Ȯ��
		System.out.println(stack.size()); // 5��
				
		// ����(LIFO)
		System.out.println(stack.pop()); // �̰���
		System.out.println(stack.pop()); // ������
				
		// ��� �� ���
		System.out.println(stack.peek()); // �̰���, ������ ���� ��(���� �ֱ� �� : ���Ѻ�)
				
		// ���ϴ� Ȯ��
		System.out.println(stack.contains("���ϴ�")); // ��������� true �ƴϸ� false
				
		// ��ü �ʱ�ȭ
		stack.clear(); // ���� ����
				
		// ���� Ȯ��
		System.out.println(stack.empty()); // ��������� true ��������� false
	}
	
	public void PracticeQueue() {
		// ť�� ��� �߰�, ��ȯ, �����ϰ� while�� ����غ���
		Queue<Integer> queue = new LinkedList<>();
		
		// ��� �߰�
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		// ť ũ�� Ȯ��
		int size = queue.size();
		System.out.println(size); // 3��
		
		// ��� �����ϰ� ���(FIFO)
		int removedElement = queue.poll(); // ���� ���� ���� 1 ���
		System.out.println(removedElement);
		
		// ť�� ����Ʈ��� Ȯ���ϱ�
		int frontElement = queue.peek(); // 1 ���� �� 2�� ����Ʈ ��Ұ� ��
		System.out.println(frontElement);
		
		// while���� ����� ��ü ���
		while(!queue.isEmpty()) { // 1 ���� �� ���� ���� ������� 2�� 3���
			int element = queue.poll();
			System.out.println(element);
		}
	}

}
