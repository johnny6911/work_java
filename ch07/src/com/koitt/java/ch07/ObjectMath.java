package com.koitt.java.ch07;

public class ObjectMath {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.getClass());	// 클래스의 전체 이름
		System.out.println(obj.hashCode());	// 가짜 주소값
		System.out.println(obj.toString());	// 직접 가서 살펴보기
		
		//Math m - new Math(); // 오류 발생 , 객체로 만들수가 없다(private)
		System.out.println(Math.PI);  // static타입 math로 접근했다 객체를 만들수 없음
		System.out.println(Math.round(-3.5));	// 반올림
		System.out.println(Math.abs(-3.4));		// 절대값
		System.out.println(Math.pow(3, 4));		// 3의 네제곱
	}
}
