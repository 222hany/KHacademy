package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����.
//			*���� : �������� ������� ��.
public class RandomMain {

	public static void main(String[] args) {
		RandomMain rm = new RandomMain();
		rm.Lotto();
		//rm.RandomExam();
	}
	
	public void Lotto() {
		// �ζǹ�ȣ ������
		Random rd = new Random(); // ���� ��ü ����
		
		// ArrayList ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>();
		
		// ���� ���ڸ� �� ��
		int six = 6; // �ζ� ��ȣ �� �� ���� ������ ����
		while(lottoNum.size() < 6) { // 0,1,2,3,4,5
			int ranNum = rd.nextInt(45); // 0 ~ 44 ���� ���� �ϳ� ����
			int addNum = ranNum + 1; // 0(+1)~44(+1) = 1 ~ 45 ���� ����.
			if(!lottoNum.contains(addNum)) { // �����ϴ��� ���� Ȯ��(�ߺ� ó��)
				lottoNum.add(addNum); // !�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ���
			}
		}
		System.out.println("�ζ� ��ȣ : " + lottoNum);
	}
	
	public void RandomExam() {
		Random rd = new Random(); // ���� ��ü ����
		
		// 1. ���� ���� ������ ������ ������ �����
		int ranInt = rd.nextInt(100); // 0 ~ 99 ���̿��� 1���� ���� ����.
		System.out.println(ranInt);
		
		// 2. �Ǽ� ���� ������ ������ ������ �����
		double ranD = rd.nextDouble(); // 0.0 ~ 1.0
		System.out.println(ranD);
		
		// 3. boolean �� �������� ����
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}
	
}
