package com.kh.treeMain;
//노드를 삽입하고 돌아가며 출력하는 이진트리
//전위 순회 : root(뿌리)를 먼저 방문
//중위 순회 : 왼쪽 하위 트리를 방문 후 root(뿌리) 방문
//후위 순회 : 하위 트리 모두 방문 후 root(뿌리) 방문
//층별 순회 : 위 쪽 node들 부터 아래방향으로 차례대로 방문
public class BinaryTree {
	TreeNode root;
	
	public BinaryTree() {
		this.root = null;
	}
	// insert 매소드와 insertRec 매소드는 이진 트리에 새로운 노드를 삽입하는데 사용
	// insert : 외부에 노출되는 매서드
	public void insert(int data) {  
		root = insertRec(root, data);
	}
	// insertRec : 실제 삽인 작업 매소드.
	// 재귀적으로 노드를 삽입하고 적절한 위치를 찾아 새로운 노드를 생성 *(재귀적 : 자기자신을 포함하고 다시 자기자신을 사용해서 정의)
	private TreeNode insertRec(TreeNode root, int data) { 
		if( root == null ) { 
			root = new TreeNode(data);
			return root;
		}
		
		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	// inOrderTR : 중위순회를 수행하여 트리의 노드를 출력하는데 사용
	// 출력순서 : 왼쪽서브트리-> 현재노드-> 오른쪽서브트리
	public void inOrderT() { // inOrderTraversal : 중위순회
		inOrderTR(root);
	}
	
	private void inOrderTR(TreeNode root) {
		if(root != null) {
			inOrderTR(root.left);
			System.out.println(root.data + " ");
			inOrderTR(root.right);
		}
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		// 노드의 값이 부모보다 작으면 왼쪽, 노드의 값이 부모보다 크면 오른쪽
		tree.insert(50); // 루트 노드
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		
		System.out.println("이진 트리의 중위순회 결과 : ");
		tree.inOrderT();
	}

}