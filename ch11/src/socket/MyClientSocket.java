package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class MyClientSocket {
	Socket socket;
	BufferedReader in;
	PrintWriter out;

	public MyClientSocket (String ip, int port) { // 프로세스에 필요한 포트번호
		try {
			socket = new Socket(ip, port);

			//서버 소켓에 스트림을 연결
			//접속에 성공했으면 입출력스트림 뺴올수있음 (빼와서 서로 통신)
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			printInfo();
		}catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	
	public void receive() {
		try {
		System.out.println("[서버] " + in.readLine());
	} catch (IOException e) {
		System.out.println(e.toString());
	}
	}
	public void send(String msg) {
		out.println(msg);
		out.flush();
		System.out.println("[클라이언트] " + msg);
	}
	public void close() {
		try {
		socket.close();
	} catch (IOException e) {
		System.out.println(e.toString());
	}
	}
	
	public void printInfo() {
		System.out.println(">> 서버 접속에 성공했습니다");
		System.out.println("   	서버 주소: " + socket.getInetAddress());
		System.out.println("    서버 포트번호: " + socket.getPort());
		System.out.println("    클라이언트 포트번호: " + socket.getLocalPort() + '\n');
	}
	
	public static void main(String[] args) {
		//서버 주소와 포트번호를 지정하여 서버에 접속
		MyClientSocket client = new MyClientSocket("127.0.0.1", 7070);
		
		System.out.print("서버에게 보낼 메시지 입력 >> ");
		Scanner s = new Scanner(System.in);
		String msg = s.nextLine();
		client.send(msg);
		client.receive();
		client.close();
	}
	
}
