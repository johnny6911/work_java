package com.koitt.java.ch07;

import java.util.List;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		
		//제네릭(Generic)
		List<Object> data = new Vector<Object>(3); //생성자 호출하고 있음 (3)은 배열의 크기를 3이라고 정해준것
		//Vector data = new Vector(3); // 경고발생
		 // 배열의 첫번째칸에 2012가 들어감, addElement와 add는 같은기능인데 addElement는 vector 다운캐스팅을 해야만 쓸수있음
		((Vector<Object>)data).addElement(2012);
		data.add("년도"); // add는 인터페이스에도 vector에도 존재하기에 넓게 이용해서 사용가능
		((Vector<Object>)data).addElement(4.35); // 위 add와 같음
		data.add(2, "목표 학점"); // index의 2번째값이 목표학점이 됨
		((Vector<Object>)data).insertElementAt("자바 강좌", 0);
		System.out.println("size = " + data.size());
		System.out.println("capacity = " + ((Vector<Object>)data).capacity()); // 용량, 두배로 늘려줬음
		System.out.println(data.toString());
	}
}
