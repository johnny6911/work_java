package practice;

import java.io.File;

public class Test03 {
	public static void main(String[] args) {

		// practice 폴더를 객체화
		File parent = new File("src/practice");
		
		// practice 폴더 내부의 파일 혹은 폴더 목록을 제공
		String[] list = parent.list(); // 폴더안에 있는 파일들을 가져올수있음
		
		// 포문을 이용하여 한바퀴씩 돌림
		for (int i = 0; i < list.length; i++) {
			String name = list[i]; //임시로 저장함
			
			// practice 폴더내의 파일 혹은 폴더를 객체화
			File file = new File("src/practice/" + name);
			
			// File 클래스의 API(메소드)를 이용해서 파일인지 폴더인지 구분
			if (file.isDirectory()) {	// 폴더이면 true
				System.out.println("폴더: " + name);
			}
			else if (file.isFile()) {	// 파일이면 true
				System.out.println("파일: " + name);
			}
		}
	}
}
