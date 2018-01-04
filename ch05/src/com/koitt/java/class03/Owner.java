package com.koitt.java.class03;

/*
 * Owner(주인)은 Cat(고양이)를 한마리씩 가질 수 있다
 */
public class Owner {
	
	private String name;	// 주인 이름
	private String address; // 주인의 주소
	private Cat[] cat1;		// 주인이 소유한 고양이
	
	public Owner(String name, String address, Cat[] cat1) {
		this.name = name;
		this.address = address;
		this.cat1 = cat1;
	}
	
	//getter, setter
	public Cat[] getCat1() {
		return cat1; //배열을 리턴하게됨
	}


	public void setCat1(Cat[] cat1) {
		this.cat1 = cat1;
	}


	// 주인이 소유한 고양이 소개하는 메소드 구현
	public void introCat() {
		System.out.print("나의 고양이는 ");
		for (int i = 0; i < cat1.length; i++) {
		System.out.print(cat1[i].getName() + "이고, 나이는 ");
		System.out.println(cat1[i].getAge() + "살 입니다");
		}
		System.out.println("그래서 총 " + cat1.length + "마리 입니다.");
	}
}
