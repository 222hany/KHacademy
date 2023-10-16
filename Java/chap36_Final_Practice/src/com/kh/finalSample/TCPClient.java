package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException {
		int port = 1234;
		String serverIP; // �� IP�ּ�
		
		serverIP = InetAddress.getLocalHost().getHostAddress();
		System.out.println(serverIP);
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println("server IP");
			Socket socket = new Socket(serverIP, port);
			System.out.println("server connect");
			
			// Ŭ���̾�Ʈ�� ����� ���� ����� ��Ʈ�� ����
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			OutputStream output = socket.getOutputStream();
			
			// Ŭ���̾�Ʈ���� ������ �޼��� ����
			String msg = "Hi, Server.";
			output.write(msg.getBytes());
			output.flush();
			socket.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
