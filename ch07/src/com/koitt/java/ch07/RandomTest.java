package com.koitt.java.ch07;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random rd = new Random(); // rd 객체만듬
		// Random rd = new Random(45);
		
		for (int i = 0; i < 6; i++) {
			System.out.print(rd.nextInt() + " "); // Int 범위안에서 랜덤하게 추출한 숫자
		}
		System.out.println();
		
		for (int i = 0; i < 6; i++) {
			System.out.print((rd.nextInt(44) + 1) + " "); // 44 내에서 랜덤하게 뽑은것 (1부터 시작하기 위해서 +1을 붙인것)
		}
		System.out.println();
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("%.2f ", rd.nextDouble()); // 더블형으로 랜덤하게 출력한것(소수점 둘째자리까지만)
		}
		System.out.println();
	}
}
