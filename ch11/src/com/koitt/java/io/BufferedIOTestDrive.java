package com.koitt.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOTestDrive {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("music.mp3");
			fos = new FileOutputStream("music-copy.mp3"); //복사된 파일
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos); // 체인 스트림 추가한것
			
			// 현재 시간을 밀리초로 시작 및 저장
			long startTime = System.currentTimeMillis(); //현재 시간을 밀리세컨드로 뽑아오는것
			System.out.println("복사 시작 ===");
			
			byte[] buffer = new byte[100];
			while (bis.read(buffer) != -1) {
				bos.write(buffer);
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("복사 종료 ===");
			
			System.out.println("복사하는데 걸린 시간: " + (endTime - startTime) + "ms");
			
			// 보통은 체인스트림 먼저 닫아주고 커넥션 스트림 닫아줌
			bos.close();
			bis.close();
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
