package basicio;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		//읽을 파일 이름 지정
		String fname = "src/basicio/FileInfo.java";
		//File 객체 생성
		File f = new File(fname); // 실제 파일을 객체화
		System.out.println("파일 " + f.getName() + " 정보:"); 
		System.out.println();
		System.out.println("\t경로: " + f.getPath());
		System.out.println("\t절대패스: " + f.getAbsolutePath()); // 제일 상단의 경로부터 (C드라이브부터)
		System.out.println("\t부모: " + f.getParent()); // 이 파일의 부모( 여기서는 디렉토리(폴더))
		System.out.println("\t쓰기여부: " + f.canWrite()); 
		System.out.println("\t읽기여부: " + f.canRead());
		System.out.println("\t폴더여부: " + f.isDirectory()); //폴더가 아니므로 false가 뜸
		System.out.println("\t수정일: " + new Date(f.lastModified())); // 파일 수정일 출력
		System.out.println("\t파일크기: " + f.length() + "바이트");
	}
}
