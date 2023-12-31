package com.kh.graphMain;

import java.util.LinkedList;
// Graph Class : 인접리스트를 사용해서 노드와 간선을 저장.
public class Graph {
	private int V; // 그래프의 노드 수
	
	// adjList 인접리스트 배열. 각 노드마다 연결된 노드들을 연결하기 위해 LinkedList 객체배열로 초기화.
	private LinkedList<Integer>[] adjList;
	
	// 그래프 생성자
	// 그래프 크기(노드 수)를 받아와서 그래프를 초기화. adjList배열의 각 원소를 빈 LinkedList로 초기화.
	public Graph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		for(int i = 0; i < ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	// addEdge : 그래프에 새로운 간선을 추가.
	public void addEdge(int source, int des) {
		// source에서 des로 가는 엣지를 추가하면 adjList배열에서 source에 해당하는 LinkedList에 des추가.
		adjList[source].add(des);
	}
	
	// 그래프 탐색(깊이 우선 탐색)
	// 깊이 우선 탐색을 수행하고, 시작 노드를 매개변수로 받음.
	public void DFS(int startNode) {
		// 방문여부를 추적하기 위한 visited 배열 초기화
		boolean[] visited = new boolean[V];
		DFSUtil(startNode, visited);
	}
	
	// 실제 깊이 우선 탐색 수행
	private void DFSUtil(int currentNode, boolean[] visited) {
		// 현재 노드를 방문한 것으로 표시
		visited[currentNode] = true;
		System.out.println(currentNode + " "); // 노드번호 출력
		
		// 현재 노드와 연결된 인접 노드를 확인하고 방문하지 않은 인접노드를 재귀적(원래의 자리로 돌아오거나 되돌아오는)으로 방문
		for(int neighbor : adjList[currentNode]) {
			if(!visited[neighbor]) {
				DFSUtil(neighbor, visited);
			}
		}
	}
}
