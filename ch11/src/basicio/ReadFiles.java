package basicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {
	public static void main(String[] args) {
		int data;
		
		// 읽을 파일 이름 지정
		String fname = "src/basicio/ReadFiles.java"; // 여기서 최상의 폴더는 프로젝트 폴더(ch11)
		
		FileInputStream fis = null;
		
		try {
			// 읽을 파일 이름으로 FileInputStream 생성
			/*FileInputStream*/ fis = new FileInputStream(fname); //커넥션 스트림, 1바이트씩 읽는 스트림
			
			// 한 바이트씩 읽어 문자로 변환하여 출력
			while ((data = fis.read()) != -1) { // 1바이트씩 읽어서 문자(char)형으로 변환해서 출력하고있음
				char c = (char)	data;		// 더이상 읽을게 없으면 -1값을 리턴하고 와일문이 종료가 됨
				System.out.print(c);
			}
		}catch (FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다 : " + fname);
		}catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
	}
}
