package com.koitt.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTestDrive {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("music.mp3");
			fos = new FileOutputStream("music-copy.mp3"); //복사된 파일
			
			// 현재 시간을 밀리초로 시작 및 저장
			long startTime = System.currentTimeMillis(); //현재 시간을 밀리세컨드로 뽑아오는것
			System.out.println("복사 시작 ===");
			
			int data = 0;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("복사 종료 ===");
			
			System.out.println("복사하는데 걸린 시간: " + (endTime - startTime) + "ms");
			
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
