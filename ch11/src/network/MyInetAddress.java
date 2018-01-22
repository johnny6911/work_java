package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddress {
	InetAddress ip;

	public MyInetAddress(InetAddress ip) {
		this.ip = ip;
	}
	public void setInetAddress(InetAddress ip) {
		this.ip = ip;
	}
	public void printInfo() {
		System.out.println(ip.getHostName());	// 해당 컴퓨터 이름
		System.out.println(ip.getHostAddress()); // ip 주소
		System.out.println(ip.toString());		//유투브 문자열이 출력됨, toString을 지워도 똑같은 결과
	}

	public static void main(String[] args) {

		try {
			System.out.println(InetAddress.getByName("www.youtube.com"));
			MyInetAddress inet = new MyInetAddress(InetAddress.getLocalHost()); // 직접 만든것, Local 현재 컴퓨터를 의미, inet라는 객체를 리턴받게됨
			inet.printInfo(); // 직접 만든 printInfo라는 함수를 호출
			
			inet.setInetAddress(InetAddress.getByName("www.naver.com"));
			inet.printInfo();
		}
		catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
