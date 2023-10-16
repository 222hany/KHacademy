package com.kh.TodoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
	private ArrayList<String> tasks;
	
	public TodoList() {
		tasks = new ArrayList<>();
	}
	
	public void addTask(String task) {
		tasks.add(task);
	}
	
	public void changeTask(int index, String task) {
		if(index >= 0 && index < tasks.size()) {
			tasks.set(index, task);
		}
	}
	
	public void removeTask(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		}else {
			System.out.println("�߸��� �ε����Դϴ�.");
		}
	}
	
	public void clearTask() {
		tasks.clear();
		System.out.println("���� �� ���� ��� ���´�!!!");
	}
	
	public void diplayTasks() {
		System.out.println("My TodoList");
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + "." + tasks.get(i));
		}
	}
	
	public static void main(String[] args) {
		TodoList todolist = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�� �� �߰�:add, �� �� ����:change, ����:remove, �� �� ������:clear, ����Ʈ ����:list, ����:exit �Է��ϼ���.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.nextLine();
				todolist.addTask(task);
			} else if(choice.equalsIgnoreCase("change")) {
				System.out.println("���� �� ���� ��ȣ�� �Է��ϼ���.");
				int index = Integer.parseInt(sc.nextLine()) -1;
				System.out.println("�� ���� �Է��ϼ���.");
				String task = sc.nextLine();
				todolist.changeTask(index, task);
			} else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("���� �� �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todolist.removeTask(index);
				} catch (Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			} else if(choice.equalsIgnoreCase("clear")) {
				todolist.clearTask();
			} else if(choice.equalsIgnoreCase("list")) {
				todolist.diplayTasks();
			} else if(choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����");
		sc.close();
	}

}
