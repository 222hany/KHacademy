package com.kh.api.exam1;

import java.util.StringTokenizer;
//StringTokenizer Ŭ���� : ���ڿ��� �и��ϴ� �� ���. �־��� ������(�⺻:����)�� �������� ���ڿ��� ��ū���� �и�.
public class StringTokenizerMain {

	public static void main(String[] args) {
		StringTokenizerMain stm = new StringTokenizerMain();
		//stm.STExam();
		//stm.STExam2();
		//stm.STExam3();
		//stm.STExam4();
		//stm.STExam5();
		stm.StringtoMath();
		
	}
	
	public void STExam() {
		String text = "apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		// hasMoreTokens
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
	
	public void STExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ",");
		
		while(tokenizer.hasMoreElements()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	
	public void STExam3() {
		// - �����ڸ� ����ؼ� text ����� - �����ڷ� ��� ����ϱ�
		String text = "apple-banana-cherry-dragonfruit";
		StringTokenizer tokenizer = new StringTokenizer(text, "-");
		
		while(tokenizer.hasMoreElements()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	
	public void STExam4() {
		// Ư�� �ܾ� �����ϰ� �����ڷ� �и�
		String test = "This is a test. But not a real one";
		StringTokenizer tokenizer = new StringTokenizer(test, ". ");
		
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if(!word.equals("test")) {
				System.out.println(word);
			}
		}
	}
	
	public void STExam5() {
		// ��¥ �����ڷ� �и�
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date, "-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println("Year : " + year);
		System.out.println("Month : " + month);
		System.out.println("Day : " + day);
	}
	
	public void StringtoMath() {
		String text = "The price is $15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, "$.");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(token.matches("\\d+(\\.\\d+)?")) {
				System.out.println("Number : " + token);
			}
		}
	}
	

}
