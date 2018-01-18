package com.koitt.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOTextDrive {

	public static void main(String[] args){
		// 파일에 저장할 객체 생성
		Person p1 = new Person("홍길동", "서울", 30);
		Person p2 = new Person("홍길순", "부산", 28);
		Person p3 = new Person("홍길자", "전주", 35);

		// 1. Connection Stream, Chain Stream 생성(오브젝트 , 파일의 기본으로 필요하여 모든 스트림 공통)
		ObjectOutputStream oos = null;	// Chain Stream
		FileOutputStream fos = null;	// Connection Stream

		//person.dat 파일을 Destination으로 지정
		try {
			fos = new FileOutputStream("person.dat"); //종착지
			oos = new ObjectOutputStream(fos); //fos를 오브젝트스트림에 끼워줌

			// Connection Stream을 이용해서 객체들을 개울가에 띄워 올림
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);

			// 더이상 떠내려올 객체가 없다는것을 알려주기 위해 null값을 띄워 올림
			oos.writeObject(null);

			/*
			 *  writeObject 메소드가 ObjectOutputStream과 FileOutputStream을 거쳐
			 *  person.dat까지 객체를 보낸다
			 */

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("객체 정보를 파일에 저장완료 했습니다 ...");
		
		// ****************************************
		
		FileInputStream fis = null; //입력받아야하므로 input
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("person.dat"); // 소스가 파일이 되는것, 커넥션스트림까지 온상태
			ois = new ObjectInputStream(fis);		// 체인 스트림에 왔음
			
			Object item = null;	
			while ((item = ois.readObject()) != null) { //리드오브젝트로 커넥션 스트림에서 개체를 끄집어내 데스티네이션에서 출력한다
				System.out.println(item);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally { // 항상 닫아줘야함
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
}

