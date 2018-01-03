package com.koitt.java.class03;

/*
 * Owner(주인)은 Cat(고양이)를 한마리씩 가질 수 있다
 */
public class Owner {
	
	private String name;	// 주인 이름
	private String address; // 주인의 주소
	private Cat cat1;		// 주인이 소유한 고양이
	
	public Owner(String name, String address, Cat cat1) {
		this.name = name;
		this.address = address;
		this.cat1 = cat1;
	}
	
	// 주인이 소유한 고양이 소개하는 메소드 구현
	public void introCat() {
		System.out.print("나의 고양이는 ");
		System.out.print(cat1.getName() + "이고, 나이는 ");
		System.out.println(cat1.getAge() + "살 입니다");
	}
}
