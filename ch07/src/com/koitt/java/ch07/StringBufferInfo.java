package com.koitt.java.ch07;

public class StringBufferInfo {
	public static void main(String[] args) {
		StringBuffer pg = new StringBuffer("Java");	// 용량 16
		
		System.out.println(pg.capacity()); //StringBuffer안에있는 배열의 크기는 20
		System.out.println(pg.append(" language")); // java 뛰우고 language를 치면 4칸이 남으므로 출력이 된다
		System.out.println(pg.insert(5, "programming")); // 칸이 되는지 먼저 확인하고 기존 배열의 2배로 늘려 출력한다 (pg값이 value에 넣어져 있음)
		System.out.println(pg.capacity()); // 42
		System.out.println(pg);
		System.out.println(pg.replace(0, 4, "Objective-C")); // java(0번째부터 4까지)의 자리에 objective-c를 대신 출력함(모자란칸은 추가됨)
		System.out.println(pg.substring(0, 9));				// Objective 의 9번째 스트링값까지 출력
		System.out.println(pg);
		System.out.println(pg.charAt(10)); // 10번째에 있는 char C를 끄집어낸것
		pg.setCharAt(10, 'D'); // 10번째 있는 char C를 D바꾼것
		System.out.println(pg);
	}
}
