package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		int data;
		
		String fname = "src/practice/chevrolet-camaro.jpg";
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(fname);
			while((data = fis.read()) != -1) {
				//char c = (char) data;
				System.out.println((char) data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다 : " + fname);
		} catch (IOException e) {
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
