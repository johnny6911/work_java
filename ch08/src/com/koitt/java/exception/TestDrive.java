package com.koitt.java.exception;

public class TestDrive {
	// 예외는 CallforName에서 발생했지만 처리는 메인에서 한것
	public static void main(String[] args) {
		CallforName object = new CallforName(); // 객체 만듬
		try {
			object.call(); // 객체에 있는 메소드 호출
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("예외가 정상적으로 처리됬다면 출력되시오");
	}
}
