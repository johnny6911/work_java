package basicio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {
	public static void main(String[] args) {
		//읽을 파일 이름 지정
		String line;
		
		// 읽을 파일 이름으로 FileInputStream 생성
		String fname = "src/basicio/MyInputStreamReader.java";
		
		try {
			//파일 입력스트림을 다시 InputStreamReader로 연결
			FileInputStream fis = new FileInputStream(fname); // 커넥션 스트림
			
			// 읽을 파일 이름으로 FileInputStream 생성
			InputStreamReader isr = new InputStreamReader(fis); // 체인 스트림

			//현재 InputStreaReader의 인코딩 방식 출력
			System.out.println(isr.getEncoding());
			
			//InputStreamReader를 다시 BufferedReader로 연결
			BufferedReader br = new BufferedReader(isr); // 체인 스트림 ,최종적으로 쓰는것
			System.out.println();
			
			//한 줄씩 읽어 출력
			while((line = br.readLine()) != null) { // BufferedReader에서 readLine 메소드를 불러오고 한줄씩 출력
				System.out.println(line);
			}
			br.close();
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다: " + fname);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println();
	}
}
