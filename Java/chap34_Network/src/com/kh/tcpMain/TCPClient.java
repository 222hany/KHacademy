package com.kh.tcpMain;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws Exception {
			// �����ּҿ� ��Ʈ ��ȣ�� ���� ����
			// �����ּҿ� ��Ʈ ��ȣ�� ���� �����ϰ��� �ϴ� ��Ʈ�� �����ؾ� ��
			Socket socket = new Socket("localhost", 8080);
			System.out.println("[ Server Connect ]");
			
			// ���� �� �ڵ�
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			printStream.print("HI SERVER");
			printStream.flush();
			
			// �����κ��� �о��
			InputStream inStream = socket.getInputStream();
			Scanner sc = new Scanner(inStream);
			System.out.println("[Client] server : " + sc.nextLine());
			sc.close();
			
			socket.close();
			System.out.println("BYE SERVER");
	}
}