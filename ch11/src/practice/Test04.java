package practice;

import java.io.File;

public class Test04 {
	public static final String PATH = ".";
	
	public static void main(String[] args) {
		
		// 명령행에서 폴더명을 입력받아 File 객체화 
		File directory = new File(args[0]);/*"src/practice/" +*/
		
		// 폴더 생성
		boolean isMake = directory.mkdir();
		if (isMake){
			System.out.println("폴더가 생성되었습니다.");
		}
		else {
			System.out.println("폴더 생성 실패했습니다.");
		}
	}
	/*
	 * 이클립스에서 실행 : 프로젝트 최상위 폴더(ch11)에서 폴더가 생성됨
	 * cmd에서 실행: 현재 실행한 폴더에서 폴더가 생성됨(현재 폴더기존)
	 */
}
