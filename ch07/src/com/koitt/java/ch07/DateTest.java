package com.koitt.java.ch07;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest {
	public static void main(String[] args) {
		Date now = new Date(); // 객체가 만들어진 시간이 출력됨
		System.out.println(now);
		System.out.println(now.getTime());
		
		// getDate의 인스턴스객체를 df에게 줌
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		System.out.println(df.format(now));
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		System.out.println(df.format(now));
		System.out.println();
		//1970년 1월 1일 이후 지난 천분의 1초 시간으로 생성
		
		Date when = new Date(100_000_000_000L); // 1억초 뒤에 찍힌 날짜
		System.out.println(when + " == " + (Date)when.clone()); //객체(when)를 하나 복제함
		System.out.println(when.before(now));	//now 라는 시간이 when보다 앞에 있기에 트루
		System.out.println(when.equals(now));	//when과 now와 실제 날짜가 같은지를 비교 메소드 오버라이딩이 구현됨
		System.out.println(when.compareTo(now));
		
		
	}
}
