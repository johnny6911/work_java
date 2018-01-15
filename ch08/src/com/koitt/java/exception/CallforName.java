package com.koitt.java.exception;

public class CallforName {

	public void call() throws ClassNotFoundException { // 컨트롤 + 1 누르고 throws 생성
		Class<?> forName = Class.forName("java.lang.Objec");
		System.out.println(forName);
	}
}
