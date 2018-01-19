package basicio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;	// 커넥션 스트림 (Source 또는 Destination에 직접 연결)
		BufferedInputStream bis = null;	// chain 스트림(Source 또는 Destination에 직접 연결이 불가능)
		BufferedOutputStream bos = null;		// chain 스트림
		String fname = "src/basicio/test.buff";

		try {
			fos = new FileOutputStream(fname);
			bos = new BufferedOutputStream(fos);
			byte data[] = {'A', 'B', 'C', 'D', 'E'};
			//한 바이트씩 읽어 FileOutputStream으로 출력
			bos.write(data, 0, 5); //0은 인덱스, 5는 length 즉 5개 문자를 전부 쓴다는 소리
			bos.close();
			fos.close();
			System.out.println(fname + " : 파일이 생성되었습니다.");

			bis = new BufferedInputStream(new FileInputStream(fname));
			data = new byte[10];
			bis.read(data, 0, 10);
			bis.close();
			System.out.println(Arrays.toString(data));
		} 	catch ( FileNotFoundException e) {
			e.printStackTrace();
		}   catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
