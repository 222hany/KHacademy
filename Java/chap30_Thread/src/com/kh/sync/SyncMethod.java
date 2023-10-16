package com.kh.sync;
/* synchronized : ���� ������ ȯ�濡�� ���� �������κ��� �������� �ϰ����� ��ȣ�ϱ� ���� ���Ǵ� Ű����. �ϳ��� �����尡 Ư�� ���
				  �Ǵ� �ż��带 �����ϴ� ���� �ٸ� �����尡 ������ ��� �Ǵ� �ż��忡 ���ÿ� �������� ���ϵ��� ��. ������ �� ����
				  ���ǰ� ������ ����ġ ������ �����ϴµ� ����.
				  
				  �ż��� ����ȭ : �ż��� ��ü�� ����ȭ �ϴ� ��� �ش� �ż����� ���� �߿��� �ٸ� �����尡 �ش� �ż��忡 ������ ��
				  			   ����.
				  *
				  public synchronized void syncMethod() {
				  		// ����ȭ �� �ż��� ����
				  }
				  
				  ��� ����ȭ : Ư�� ����� ����ȭ�ϴ� ��� ��� ������ �ڵ常 ����.
				  *
				  public void someMethod() {
				  		// �񵿱� �ڵ�
				  		synchronized() {
				  			//����ȭ �� ��ϳ���
				  		}
				  		// �񵿱� �ڵ�
				  }
*/
public class SyncMethod {
	private int count = 0;
	private Object lockObj = new Object(); // ����ȭ�� ���� ��ü
	
	// �ż��� ���� ����ȭ�� ����ؼ� count ������ ������Ŵ. �� ���� �ϳ��� �����常 ������ �� �ֵ��� ����.
	public synchronized void increment() {
		count++;
	}
	
	/*
	pTask : ����ȭ �� ��ϰ� �Բ� ���.
	synchronized(lockObj) : �ڵ� ��� ������ count ������ ������Ű�� ���� lockObj�� ����Ͽ� ����ȭ�� ����.
	lockObj�� ����ϴ� ���� : �ٸ� �ż��忡�� ����ȭ�� ����� �� �ְ�, �ٸ� ��ü�� ���� ����ȭ�� �и��Ǿ� �浹�� ������ �� ����.
	*/
	public void pTask() {
		// �ٸ� �񵿱� �ڵ�
		synchronized(lockObj) {
			// lockObj�� ����� ����ȭ �� ���
			count++;
		}
		// �ٸ� �񵿱� �ڵ�
	}
	
	public static void main(String[] args) {
		// syncMethod Ŭ������ �ν��Ͻ��� ����.
		SyncMethod sync = new SyncMethod();
		
		// Runnable �������̽� ������ ����Ͽ� �� ���� ������ ����
		// thread1
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					sync.increment();
				}
			}
		};
		// thread2
		Runnable task2 = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					sync.increment();
				}
			}
		};
		
		// ������ ���� �� ����
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		
		// ��� �����尡 ����� ������ ���
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����ī��Ʈ : " + sync.count);
	}

}

// synchronized count ������ ���� ���� ������ ����ȭ.
// ������ �� ���� ������ �߻������ʰ� count�� ������ �����ϰ� ����. �������� �ϰ����� ����.