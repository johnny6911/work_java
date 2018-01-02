package com.koitt.java.class01;

public class Person extends Animal{

	/*
	 * 부모인 Animal의 필드를 상속받기 때문에
	 * 중복으로 작성하지 않아도 된다.
	 */
	private String ssn;		// 멤버변수 혹은 필그
	private String address;
	
	public String getSsn() {
		// return sanghoon.ssn
		return this.ssn;
	}
	//this는 자기자신
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//메소드 - Person의 내용을 출력
	public void print() {
		System.out.println("주민등록번호: " + this.ssn + ", 주소: " + this.address);
	}
}
