package udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BasicUDPClient {
	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress server;
	int port = 8888;

	public BasicUDPClient(String ip, int port) {
		try {
			// DatagramPacket에 들어갈 ip 주소가 InetAddress 형태여야 함
			server = InetAddress.getByName(ip);
			this.port = port;
			this.dsock = new DatagramSocket();
			System.out.println(">> 서버에 접속합니다");
			System.out.println(">> 서버에 전달할 메시지를 쓰고 Enter를 누르세요");
			System.out.println(">> 종료하려면 quit를 쓰고 Enter를 누르세요" + "\n");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void communicate() {
		try { //표준입력받을 준비를 함
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strOut = null;
			while ((strOut = br.readLine()) != null) { //readLine에서 대기하다 문자열을 치면
				//DatagramPacket에 입력 줄을 저장하고 서버에 전송
				sPack = new DatagramPacket(strOut.getBytes(), // strOut에 그 문자열이 저장됨, getByte는 문자열을 바이트로 바꿔줌
						strOut.getBytes().length, server, port); // 바이트배열의 길이, inetaddress정보(보내고자하는 서버의 주소(ip 주소)), 포트번호를 담고있음
				dsock.send(sPack); //소켓의 센드라는 메소드로 서버로 보냄
				//서버에 quit를 전송하면 종료
				if (strOut.equals("quit"))
					break;

				//서버로부터 수신되는 DatagramPacket을 받아 표준출력
				byte[] buffer = new byte[1024]; 
				rPack = new DatagramPacket(buffer, buffer.length);
				dsock.receive(rPack); //리시브를 호출하면 서버에서 메시지가 올때가지 대기하게 되는거
				String strIn = new String(rPack.getData(), 0, rPack.getData().length); //페킷에 담겨있는 정보를 끄집어냄
				System.out.println("[서버" + server + ": " + port + "]" + strIn); //서버의 아이피주소,포트, 서버에서 입력한 문자열을 출력해줌
			}
			System.out.println("UDP 클라이언트를 종료합니다");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		BasicUDPClient client = new BasicUDPClient("127.0.0.1", 7777);
		client.communicate();
	}
}