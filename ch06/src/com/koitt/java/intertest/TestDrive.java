package com.koitt.java.intertest;

public class TestDrive implements Interface2{

	@Override
	public void test() {
		System.out.println("test() 호출 ...");
		
	}
	
	public static void main(String[] args) {
		TestDrive t = new TestDrive();
		t.test();
	}

}
