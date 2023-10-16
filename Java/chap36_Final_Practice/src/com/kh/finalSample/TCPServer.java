package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws IOException {
		int port = 1234;
		ServerSocket server = new ServerSocket(port);
		System.out.println("������ " + port + "�� ����Ǿ����ϴ�.");
	
		while(true) {
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ ���� : " + client.getInetAddress());
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
			client.close();
		}
	}
}