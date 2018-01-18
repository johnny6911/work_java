package com.koitt.java.io;

import java.io.Serializable;
								// 1. 직렬화(Serializable) 객체를 일열로 쭉 나열시키는 방법(객체를 눌렀다는것)
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;	// 클래스의 버전
	
	private String name;		//이름
	private String address;		//주소
	private int age;			//나이
	
	public Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	
}
