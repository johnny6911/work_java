package com.koitt.java.class02;

//Child 클래스는 Parent 클래스를 상속받는다
public class Child extends Parent{

	// Child 클래스의 생성자
	public Child() {
		super();	// 부모의 기본생성자 호출: 작성을 안하면 컴파일러가 자동으로 추가한다
		System.out.println("Child 기본생성자 호출...");
	}
	
	//파라미터가 하나라도 있으면 생성자 없으면 기본생성자
	public Child(String msg) {
		super();
		System.out.println("Child(String) 생성자 호출... /" + msg);
	}
	
	public Child(int num) {
		this("화이팅!");
		System.out.println("Child(int sum) 생성자 호출 ... /" + num);
	}
}
