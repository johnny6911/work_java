package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		// 파일을 객체화
		File originfile = new File(args[0]);	// 원본파일
		File copyfile = new File(args[1]);		// 앞으로 새로 생성되는 파일
		
		// 바로 복사하는 메소드가 없기에 만들어줌
		// Connection Stream
		try {
			FileInputStream fis = new FileInputStream(originfile);
			FileOutputStream fos = new FileOutputStream(copyfile); //원본파일에서 읽어들인것을 아웃풋스트림을 이용해서 출력해줌
			
			int data = -1;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
