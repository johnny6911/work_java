package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
	URL url;
	BufferedReader input;
	String inLine;

	//접속 사이트를 URL로 지정
	public URLReader(String site) {
		try {
			this.url = new URL(site); //필드에 저장
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	//접속한 페이지 내용을 표준출력에 출력
	public void printPage() {
		try {	// 사이트에 있는 내용을 가져오고있는것
			input = new BufferedReader(new InputStreamReader(url.openStream())); //인풋스트림리더는 1바이트를 2바이트로 바꿔줌
			while((inLine = input.readLine()) != null) { //페이지 내용을 한줄씩 읽고있음
				System.out.println(inLine);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public void printConnectionInfo() {
		try {
			URLConnection conn = url.openConnection();
			System.out.println(conn);
			System.out.println(conn.getURL());

		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String site = "http://www.koitt.com/";
		URLReader homePage = new URLReader(site);
		homePage.printConnectionInfo();
		homePage.printPage();
		
		// 크롤링(Crawling): 남의 사이트 정보를 가져와서 사용
	}
}
