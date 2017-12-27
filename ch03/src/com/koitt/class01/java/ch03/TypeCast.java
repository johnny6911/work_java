package com.koitt.class01.java.ch03;

public class TypeCast {
	
	public static void main(String[] args) {
		
		// 1. 명시적 형변환 
		byte b = (byte)128; // int -> byte로 명시적 형변환
		System.out.println(b);
		
		byte bt = (byte)-129;
		System.out.format("%d의 이진수: %s %n", -129, Integer.toBinaryString(-129));
		System.out.format("%d의 이진수: %s %n", bt, Integer.toBinaryString(bt));
		
		int n = (int)(5.0 / 4.0);	// 명시적 형변환 double -> int
		System.out.println(n);
		System.out.println(3 / 4);
		System.out.println(3 / 4.0);	// 묵시적 형변환 int -> double (3)

		double d = 3 + 4 * 2;		// 묵시적 형변환 int -> double (3 + 4 * 2)
		System.out.println(d);
	}
}
