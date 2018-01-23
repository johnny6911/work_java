package practice;

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
						System.out.println(serverMsg); //서버에서 날라온 메시지 받는부분

						// contain 메소드: serverMsg 문자열 중 quit이 포함된 경우 true를 리턴
						if (serverMsg.contains("quit")) {
							System.exit(0);
						}
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
					
					// 공백으로 문자열을 구분하여 배열에 담는것
					// 예) [홍길동] quit -> msg.split[0] = "[홍길동]"
					// 예) msg.split[1] = "quit"
					String temp = msg.split(" ")[1];
					switch (temp) {
					case "quit":
						System.out.print("정말로 종료하시겠습니까? (y/n) >> ");
						String yesOrNo = this.input.nextLine();
						if (yesOrNo.equals("y")) {
							System.out.println("종료됨!");	
							System.exit(0);
						}
						else if (yesOrNo.equals("n")) {
							System.out.println("종료가 취소되었습니다.");
							continue; // quit을 버리고 와일문으로 처음으로 돌아가기위해
						}
						break;
					}
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
			//String name = InetAddress.getLocalHost().getHostAddress(); // 클라이언트의 IP 
			Scanner input = new Scanner(System.in);
			System.out.print("클라이언트의 이름을 입력하세요 >> ");
			String name = input.nextLine();
			System.out.print("서버의 IP 주소를 입력하세요 >> ");
			String ip = input.nextLine();

			System.out.println("=== 채팅 프로그램 ===");
			System.out.println("connect: 서버에 접속하기");
			System.out.println("bye: 클라이언트만 종료.");
			System.out.print("명령문을 입력하세요 >> ");
			String menu = input.nextLine();

			switch(menu) {
			case "connect":
				new ChatClientTestDrive().go(ip, 7070, name);
				break;
			case "bye":
				System.exit(0);
				break;
			}


		} catch (UnknownHostException e) {
			System.out.println("올바른 서버 IP주소를 입력해주세요");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
