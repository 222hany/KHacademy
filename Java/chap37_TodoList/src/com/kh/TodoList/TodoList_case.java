package com.kh.TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TodoList_case {
	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		int taskNum = 1;
		
		Scanner sc = new Scanner(System.in);
		// �� �� �������
		
		while(true) {
			System.out.println("�� ���� �����ϼ���.");
			System.out.println("�� �� �߰��� ���� 1�� �־��ּ���.");
			System.out.println("�� �� ������ ���� 2�� �־��ּ���.");
			System.out.println("�� �� ������ ���� 3�� �־��ּ���.");
			System.out.println("�� �� ����� ������ ���� 4�� �־��ּ���.");
			System.out.println("�����Ͻ÷��� ���� 5�� �־��ּ���.");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1:
					System.out.println("�߰��� ���� �ۼ����ּ���.");
					String todoItem = sc.nextLine();
					todoMap.put(taskNum++, todoItem);
					System.out.println("�� ���� �߰��Ǿ����ϴ�.");
					break;
				case 2:
					System.out.println("������ ���� ��ȣ�� �Է����ּ���.");
					int changeNum = sc.nextInt();
					if(todoMap.containsKey(changeNum)) {
						System.out.println("���� ������ �ۼ����ּ���.");
						String changeItem = sc.nextLine();
						if(todoMap.containsKey(changeItem)) {
							todoMap.put(changeNum, changeItem);;
							System.out.println("�� ���� ����Ǿ����ϴ�.");
						}
					} else {
						System.out.println("�߸� �����ϼ̽��ϴ�.");
						}
					break;
				case 3:
					System.out.println("������ ���� ��ȣ�� �Է����ּ���.");
					int removeNum = sc.nextInt();
					if(todoMap.containsKey(removeNum)) {
						todoMap.remove(removeNum);
						System.out.println("�� ���� ���ŵǾ����ϴ�.");
					}else {
						System.out.println("�߸� �����ϼ̽��ϴ�.");
						}
					break;
				case 4:
					System.out.println("�� �� ��� : ");
					for(Entry<Integer, String> entry : todoMap.entrySet()) {
						System.out.println(entry.getKey() + " : " + entry.getValue());
					}
					break;
				case 5:
					System.out.println("���α׷��� �����մϴ�.");
					System.out.println("�ݰ������. ������ ������^^");
					sc.close();
					System.exit(0);
				default :
					System.out.println("�ùٸ� ������ �ƴմϴ�. �ٽ� �������ּ���.");
			}
		}
	}
}
