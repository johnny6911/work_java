package udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BasicUDPServer {
	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress client;
	int sport = 7777, cport;

	//생성자 업무
	public BasicUDPServer(int sport) {
		try {
			this.sport = sport;
			System.out.println(">> 서버를 시작합니다.");
			System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다" + "\n");
			this.dsock = new DatagramSocket(sport); //통신을 하기위해 Socket을 만듬
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void communicate() {
		// 버퍼드 리더는 한번에 읽어줌
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 1바이트씩 읽어들인건 2바이트씩 바꿔서 읽어줌
		try {
			//키보드로부터 전송할 문자열을 입력받기 위해 BufferedReader 형태로 전환
			while (true) {
				byte[] buffer = new byte[1024]; // 한번에 정보를 1kilo byte씩 보내겠단것
				//클라이언트에서 전송되는 DataframPacket을 받기 위해 rPack 생성한 후 대기
				rPack = new DatagramPacket(buffer, buffer.length);  //바이트 배열의 길이를 준다음, rPack에 담음
				//메시지가 올때까지는 대기상태
				dsock.receive(rPack); //클라이언트(dsock.send(sPack)에서 메시지가 올때까지 대기하다, 메시지가 오면 receive를 통해서 rPack에다 담음
				//전송받은 결과를 문자열로 변환
				//String(byte[] bytes, int offset, int length)
				String strIn = new String (rPack.getData(), 0, rPack.getData().length); //0번째부터 렝스길이만큼 배열에있는 값(예)hello)을 다 쓰겠다는것
				
				//클라이언트의 주소와 포트번호를 반환
				client = rPack.getAddress(); // 보낸쪽이 어딘지 확인할수있음
				cport = rPack.getPort();	// 포트번호도 마찬가지로 확인가능함 , 위 두개는 클라이언트의 정보를 뺴온것
				
				//전송받은 결과를 출력하고 quit이면 종료
				System.out.println("[클라이언트" + client + ": " + cport + "]" + strIn); //strIn은 입력한 문자열
				if (strIn.trim().equals("quit"))
					break;
				//표준입력으로 입력된 정보를 DragramPacket으로 만들어 클라이언트에 전송
				String strOut = br.readLine();
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);
				dsock.send(sPack); //소켓에 있는 sPack을 클라이언트로 보내줌

			}

			System.out.println("UDP 서버를 종료합니다");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		BasicUDPServer client = new BasicUDPServer(7777);
		client.communicate();
	}
}
