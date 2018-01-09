package com.koitt.java.ch07;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		
		//제네릭(Generic)
		Vector<Object> data = new Vector<Object>(3);
		//Vector data = new Vector(3); // 경고발생
		data.addElement(2012);
		data.add("년도");
		data.addElement(4.35);
		data.add(2, "목표 학점");
		data.insertElementAt("자바 강좌", 0);
		System.out.println("size = " + data.size());
		System.out.println("capacity = " + data.capacity());
		System.out.println(data.toString());
	}
}
