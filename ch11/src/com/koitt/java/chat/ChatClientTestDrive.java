package com.koitt.java.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Scanner;

public class ChatClientTestDrive {
	private Socket socket;					// 서버와 통신을 위한 ㅅ켓
	private ObjectOutputStream oos;		//서버와 통신을 위한 소켓
	private ObjectInputStream ois;			//서버로 전송하기 위한 스트림
	private String name;					//사용자의 이름
	
	class ChatClientThread extends Thread{
		@Override
		public void run() {
			while(true) {
				try {
				Object obj = ois.readObject();
				if (obj instanceof String) {
					String serverMsg = (String) obj;
					System.out.println(serverMsg);
				}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	class SendThread extends Thread{
		private Scanner input;
		
		public SendThread() {
			this.input = new Scanner(System.in);
		}
		
		@Override
		public void run() { //실행시 런이 돔
			while(true) {
				String msg = "[" + name + "] " + this.input.nextLine();
				try {
					oos.writeObject(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//클라이언트 처음 실행하는 메소드: 서버IP, PORT, 사용자명
	public void go(String ip, int port,String name) throws UnknownHostException, IOException{
		this.name =name;
		this.socket = new Socket(ip, port);
		System.out.println("서버 접속 성공 ...");
		
		// 1.  Connection Stream 소켓으로부터 받아오기
		OutputStream out = socket.getOutputStream();	
		InputStream in = socket.getInputStream();
		
		// 2. Chain Stream 생성
		this.oos = new ObjectOutputStream(out);
		this.ois = new ObjectInputStream(in);
	
		// 3. 서버로부터 전달받은 broadcast 메시지 수신을 위한 Thread 시작
		new ChatClientThread().start();
		
		// 4. 서버로 메시지 송신을 위한 Thread 시작
		new SendThread().start();
	}
	
	
	public static void main(String[] args) {
		try {
		String name = InetAddress.getLocalHost().getHostAddress(); // 클라이언트의 IP 
		new ChatClientTestDrive().go("192.168.0.18", 7070, name);
	} catch (UnknownHostException e) {
		System.out.println("올바른 서버 IP주소를 입력해주세요");
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
