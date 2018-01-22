package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BasicServerSocket {
	public static void main(String[] args) {
		try {
			System.out.println(">>> 서버를 시작합니다");
			// 프로그램 하나당 포트번호 1개
			ServerSocket mySErverSocket = new ServerSocket(7070); //7070은 포트번호
			System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다..");

			//클라이언트 접속때까지 대기
			Socket mySocket = mySErverSocket.accept();
			System.out.println(">> 클라이언트가 접속에 성공했습니다");

			//클라이언트 소켓에 스트림을 연결 (각자 스트림에 있음)
			BufferedReader in = new BufferedReader
					(new InputStreamReader(mySocket.getInputStream()));
			PrintWriter out = new PrintWriter
					(new OutputStreamWriter(mySocket.getOutputStream()));

			//클라이언트 소켓으로부터 받은 메시지를 화면에 출력
			//입력을 받기전까지는 현재 서버는 멈춰있음
			System.out.println("[클라이언트] " + in.readLine());

			//클라이언트 소켓에 메시지 전송
			String msg = "서버에 접속하신 것을 환영합니다!";
			out.println(msg);
			out.flush();
			System.out.println("[서버] " + msg);
			mySocket.close();

		}catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
