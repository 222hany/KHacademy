package com.kh.queueMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		// ť ����
		Queue<String> queue = new LinkedList<>();
		
		// ť�� ����߰�		    front��		     rear��
		queue.offer("Apple"); // +---+   +---+   +---+
		queue.offer("Banana");// | 1 | �� | 2 | �� | 3 |
		queue.offer("Cherry");// +---+   +---+   +---+
		
		// ť���� ��� ���� �� ���(FIFO����)
		String removedElement = queue.poll(); // ť���� Apple ���� �ϰ� ��ȯ
		System.out.println(removedElement);
		
		removedElement = queue.poll(); // ť���� Banana ���� �ϰ� ��ȯ
		
		// ť�� Front ��� Ȯ��
		String frontElement = queue.peek(); // ť�� ����Ʈ��� Cherry ��ȯ
		
		// ť�� ũ�� Ȯ��
		int size = queue.size();
		System.out.println(size);
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
		
	}

}
