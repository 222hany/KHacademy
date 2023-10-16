package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {
	public static void main(String[] args) {
		final String wpath = "C:\\Users\\user1\\Desktop//Userlog//고객관리파일 23-09-14.txt";
		String folderPath = "C:\\Users\\user1\\Desktop//Userlog";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
			
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		try {
			
			//     C:/Users/user1/Desktop
			//wpath = "C:\\Users\\user1\\Desktop//귀여운신입이가만든폴더//새로운파일! 새로운세상!.txt";
			FileWriter writer = new FileWriter(wpath); // 생성
			writer.write("파일 덮어써지는지 테스트");//파일 쓰기
			writer.close();// 파일 안에 내용을 다 쓰면 닫기
			
			//어디서 보던지 경로가 확실한 경로 절대경로
			FileReader reader = new FileReader(wpath);
			BufferedReader bufferdReader = new BufferedReader(reader);
			
			String line;
			while ((line = bufferdReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferdReader.close(); //파일을 다 읽으면 닫아주기.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}







/*
	String filePath = "설명 적는 란/입출력IO.txt";
System.out.println("생성");
//FileWriter fWriter = new FileWriter(filePath, true);
//true: 파일 끝에 이어쓰기
//false: 파일 덮어쓰기
* */
		//만약에 날짜가 오늘 날짜인 폴더가 없을때
		//폴더를 만들고
		/*
		File f = new File("new.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("파일을 생성했습니다.");
			} else {
				System.out.println("이미 존재하는 파일입니다.");
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		String fileName = f.getName();
		*/
		
		
		//FileReader fReader = new FileReader(f,true);