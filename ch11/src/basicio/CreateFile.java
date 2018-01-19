package basicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		//읽을 파일 이름 지정
		String fname = "src/basicio/newfile.txt";
		
		//File 객체 생성
		File f = new File(fname);
		
		//실제 파일 존재 여부 확인
		if (! f.exists()) { //fname이 존재하는지 물어봄 false의 !는 true므로 문장이 실행됨
			//처음 실행하면 파일이 없으므로 실행됨
			System.out.println("다음 파일을 찾을 수 없습니다 : " + fname);
		}
		
		//새로이 파일을 만들어 문자열을 쓰기
		try {
			f.createNewFile(); // 파일이 새로 만들어짐
			if (f.exists()) {  // 파일이 생성됬으므로 이제 존재하므로 true
				System.out.println("다음 파일이 있습니다 : " + fname);
			} // 여기까지는 파일은 만들어졌지만 파일안에 내용은 없음
			
			FileWriter fr = new FileWriter(f); // 파일라이터도 클래스, 생성자중에 하나를 호출한거, 커넥션 스트림
			fr.write("파일 내용이 들어갑니다");
			fr.close(); //파일라이터 닫아줌
			
		} catch(IOException	e) {
			System.out.println(e);
		}
	}
}
