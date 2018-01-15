package com.koitt.java.ch07.javabean;

public class PersonAutoWrite {
	private String name;
	private int age;
	
	// 1. 기본 생성자
	public PersonAutoWrite() {}

	// 2. 생성자 (모든 필드 초기화) - Alt + Shift + S ( Generate Constructor Using Field)
	public PersonAutoWrite(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 2-1 Getter, Setter 구현
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

	// 3. equals, hashCode 자동완성 - alt + shift + s ( Generate hashCode and equals)
	@Override
	public int hashCode() { // 해쉬코드는 객체를 나타내는 하나의 숫자다
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 1. 주소값 비교
		if (this == obj)
			return true;
		
		// 2. Argument에서 받은 객체가 null이면 false 리턴
		if (obj == null)
			return false;
		
		// 3. 클래스의 위치를 비교
		if (getClass() != obj.getClass())
			return false;
		
		// 4. 다운캐스팅하였음, age하고 name 을 비교하고있음
		// 필드에 접근하기 위해 다운캐스팅
		PersonAutoWrite other = (PersonAutoWrite) obj;
		
		// 5. age값(주소) 비교 age는 primitive type
		if (age != other.age)
			return false;
		
		// 6. this name이 null 값일때
		if (name == null) {
			// 비교대상의 필드가 null이 아니면 다른 객체로 판단
			if (other.name != null)
				return false;
		} 
		
		// 7. name값이 다르면 다른 객체로 판단하여 결과를 리턴
		else if (!name.equals(other.name))
			return false;
		
		// 위 조건들이 모두 만족을 안한다면 같은 객체라는것 (같은 객체로 판단)
		return true;
	}
	
	// toString 자동완성 (Alt + Shift + S - Generate toString)
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonAutoWrite [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	
	public static void main(String[] args) {
		PersonAutoWrite p = new PersonAutoWrite("홍길동", 30);
		System.out.println(p.getClass()); // p 객체의 풀클래스명이 출려되는것
		
		// toString 사용
		System.out.println(p);
	}
}
