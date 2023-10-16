package com.kh.dequeMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

	public static void main(String[] args) {
		// ArrayDeque�� ����Ͽ� Deque ����
		Deque<String> deque = new ArrayDeque<>();
		
		// ��� �߰�                     ���ۡ�                  ���� 
		deque.addFirst("First");//    [first] �� [second] �� [third]
		deque.addLast("Last");  //   ��                            ��
		                        // [     ]                    [     ]
		
		// �� �հ� �� �� ��� Ȯ��
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		// �� �հ� �� �� ��� ����
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		// ����ִ��� Ȯ��
		System.out.println(deque.isEmpty());
	}

}
