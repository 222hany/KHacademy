package com.kh.thisSample;
//this : ��ü(=�ν��Ͻ�) �ڽ��� ����Ű�� ��������. ��ü(=�ν��Ͻ�)�� �ּҰ� ����Ǿ�����.
//this() : ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ���.
	/*
	int x = 10; // ���� x�� ������ ����, 10�̶�� ���� �Ҵ�.
	int y = x;  // �������� y. x�� ����Ų��.
	
	x = 20;
	System.out.println("y : " + y); // y�� = 10.
	
	int[] list1 = {1,2,3};
	int[] list2 = list1;  //�������� list2. list1�� ����.
	*/
class MyClass {
	int myField; // this.myField
	
	MyClass() {  // ù��° ������
		this(0); // this�� ����ؼ� �ٸ� ������ ȣ��
		//this.myField = 0;
	}
	MyClass(int value) { // �ι�° ������
		this.myField = value; // ��������
	}
	void printValue() {
		System.out.println("myField�� �� : " + this.myField);
	}
}
public class ThisMain {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); // ù��° ������ ȣ��
		MyClass obj2 = new MyClass(10); // �ι�° ������ ȣ��
		
		obj1.printValue();
		obj2.printValue();
	}

}
