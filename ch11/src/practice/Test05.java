package practice;

import java.io.File;

public class Test05 {
	public static void main(String[] args) {
		// 이전 파일을 객체화
		File fromFile = new File(args[0]);
		
		// 새파일을 만들기 위해 File 객체 생성
		File toFile = new File(args[1]);
		
		// 파일명 변경하는 메소드 호출 fromFile -> toFile
		boolean isRenamed = fromFile.renameTo(toFile);
		
		if (isRenamed){
			System.out.println("파일명이 변경되었습니다.");
		}
		else {
			System.out.println("파일명 변경되지 않았습니다");
		}
	}
}
