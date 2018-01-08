package com.koitt.java.ch07;

public class WrapperInteger {

	public static void main(String[] args) {
		Integer age = new Integer(20);
		Integer snum = new Integer("20121105");
		
		System.out.println("나이: " + age.intValue());
		System.out.println("학번: " + snum.intValue());
		System.out.println(age.equals(snum)); //오버라이딩을 함
		
		System.out.println(Integer.parseInt("24567"));	//스트링 타입을 인트타입으로 바꿔준것
		System.out.println(Integer.parseInt("ff", 16)); //ff를 16진수로 읽어서 인트로 바꾸는것
		System.out.println(Integer.toBinaryString(255)); //255 이진수로 바꿔서 스트링타입으로 출력한것
		System.out.println(Integer.toString(255, 16)); // 255를 16진수로 바꿔서 스트링으로 출력한것
		
	}
}
