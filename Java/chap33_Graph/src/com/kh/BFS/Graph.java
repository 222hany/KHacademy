package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Graph { // Graph Ŭ���� : �ڷ� ������ ��Ÿ��
	private int V; // �׷����� ���� ��
	private LinkedList<Integer>[] adj; // ��������Ʈ
	
	// �׷��� �ʱ�ȭ
	public Graph(int v) { // �׷��� Ŭ������ �����ڿ��� �׷����� ���� ��(V)�� �޾Ƽ� �ʱ�ȭ
		this.V = v;
		adj = new LinkedList[v]; // adj : ��������Ʈ�� ��Ÿ���� �� �������� ������ �������� ����� ����
		for(int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	// addEdge : �׷����� ������ �߰�
	public void addEdge(int v, int w) { // v�� w�� ������ �� �� ������ ��Ÿ��
		adj[v].add(w);
	}
	
	// BFS Ž���� ����
	public void BFS(int start) {
		boolean[] visited = new boolean[V]; // visited : �� ������ �湮 ���θ� �����ϰ� ǥ���ϱ� ���� �迭
		Queue<Integer> queue = new LinkedList<>(); // Queue : BFS�� ���� ������ ������ ���
		
		visited[start] = true;
		queue.add(start); // Ž���� ���۳��(start)���� �����ϰ� ���۳�带 �湮�ϰ� ť�� �߰�
		
		while(!queue.isEmpty()) { // ť�� �̾��� �� ���� �ݺ������� ���� �ܰ��� ������ ��带 �湮
			start = queue.poll();
			System.out.print(start + " ");
			
			for(Integer neighbor : adj[start]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}

	public void DFS(int i) {
		
	}

}
