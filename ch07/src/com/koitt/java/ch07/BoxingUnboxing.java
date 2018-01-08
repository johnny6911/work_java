package com.koitt.java.ch07;

public class BoxingUnboxing {
	public static void main(String[] args) {
		//double radius = new Double(2.59); // JDK 1.5 이전
		Double radius = 2.59;				// boxing
		//double r = radius.doubleValue();	// JDK 1.5 이전
		double r = radius;					// unboxing
		System.out.print("반지름: " + r + ", 원 면적: ");
		System.out.println(radius * radius * Math.PI);
		
		Integer x = 5, y = 3;		// boxing
		System.out.printf("%d + %d = %d %n", x, y, x + y);	// unboxing
		boolean b = true;
		System.out.printf("%b %n", b);	// unboxing
	}
}
