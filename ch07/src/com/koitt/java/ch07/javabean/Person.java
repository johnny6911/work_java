package com.koitt.java.ch07.javabean;

import java.io.Serializable;

// 자바 빈 (Java Bean)
public class Person extends Object implements Serializable {

	private String name;
	private int age;
	
	// 1. 기본 생성자
	public Person() {}
	
	// 2. 생성자 (필드 전체를 초기화)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 2-1. Getter, Setter 구현
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 3. equals 구현
	@Override
	public boolean equals(Object obj) {
		// 3-1. 나 자신과 Argument의 객체 주소값 비교
		if (this == obj) {
			return true;
		}
		
		// 3-2. obj가 현재 클래스를 상속받고 있는지 확인
		if (!(obj instanceof Person)) { // 반대로 되기때문에 return false가 된다
			return false;
		}
		
		// 3-3. name 필드값이 같다면 같은 객체로 결과를 리턴
		Person p = (Person) obj; //펄슨타입으로 obj를 다운캐스팅함
		if (this.name.equals(p.name)) {
			return true;
		}
		return false;
	}
	
	 /*4. hashCode 구현: 객체 하나를 하나의 숫자로 표현하는 메소드 (가짜 주소값)
	  * unique(name과 age의 주소값을 합처줌) 한 값을 하나 만들어낸다 
	  */
	@Override
	public int hashCode() {		//Object에 있던 메소드
		return this.name.hashCode() + this.age;
	}
	
	// 5. 객체의 내용을 문자열로 표현하는 메소드
	@Override
	public String toString() {
		// Stirng a = "name = " + this.name + ", age = " + this.age; 와 같음
		StringBuilder sb = new StringBuilder();
		sb.append("name=");
		sb.append(this.name);
		sb.append(", age = ");
		sb.append(this.age);
		String a = sb.toString(); 	// 지금까지 append한 문자열을 String 타입으로 변환
		return a;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("철수", 35);
		Person p2 = new Person("영희", 30);
		Person p3 = new Person("철수", 35);
		
		// 1. equals 사용법
		if(p1.equals(p2)) {		// 철수와 영희의 이름을 비교
			System.out.println("두 사람은 같은 사람입니다");
		}
		else {
			System.out.println("두 사람은 다름 사람입니다");
		}
		if(p1.equals(p3)) {		// 철수와 영희의 이름을 비교
			System.out.println("두 사람은 같은 사람입니다");
		}
		else {
			System.out.println("두 사람은 다름 사람입니다");
		}
		
		Object o = new Object();
		System.out.println(o.hashCode()); //가짜주소값이 나옴
		
		Object o2 = new Object();
		System.out.println(o2.hashCode());
		
		// 2. hashCode 값을 출력
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	
		// 3. toString 메소드 사용
		System.out.println(p1.toString());
		System.out.println(p2);	// println 메소드에서 자동으로 객체의 toString을 호출
		System.out.println(p3);	// println 메소드에서 자동으로 객체의 toString을 호출
	
	}
}
