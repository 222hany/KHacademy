package com.kh.treeMain;
//��带 �����ϰ� ���ư��� ����ϴ� ����Ʈ��
//���� ��ȸ : root(�Ѹ�)�� ���� �湮
//���� ��ȸ : ���� ���� Ʈ���� �湮 �� root(�Ѹ�) �湮
//���� ��ȸ : ���� Ʈ�� ��� �湮 �� root(�Ѹ�) �湮
//���� ��ȸ : �� �� node�� ���� �Ʒ��������� ���ʴ�� �湮
public class BinaryTree {
	TreeNode root;
	
	public BinaryTree() {
		this.root = null;
	}
	// insert �żҵ�� insertRec �żҵ�� ���� Ʈ���� ���ο� ��带 �����ϴµ� ���
	// insert : �ܺο� ����Ǵ� �ż���
	public void insert(int data) {  
		root = insertRec(root, data);
	}
	// insertRec : ���� ���� �۾� �żҵ�.
	// ��������� ��带 �����ϰ� ������ ��ġ�� ã�� ���ο� ��带 ���� *(����� : �ڱ��ڽ��� �����ϰ� �ٽ� �ڱ��ڽ��� ����ؼ� ����)
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
	// inOrderTR : ������ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴµ� ���
	// ��¼��� : ���ʼ���Ʈ��-> ������-> �����ʼ���Ʈ��
	public void inOrderT() { // inOrderTraversal : ������ȸ
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
		
		// ����� ���� �θ𺸴� ������ ����, ����� ���� �θ𺸴� ũ�� ������
		tree.insert(50); // ��Ʈ ���
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		
		System.out.println("���� Ʈ���� ������ȸ ��� : ");
		tree.inOrderT();
	}

}