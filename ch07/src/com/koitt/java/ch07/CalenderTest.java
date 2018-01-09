package com.koitt.java.ch07;

import java.util.Calendar;

public class CalenderTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // 객체를 인스턴스가 내부적으로 만들어서 줌
		System.out.println(now.getTime());
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 월 시작이 0부터 시작이기에 1을 더해준다
		int date = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year + "년 " + month + "월 " + date + "일 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}
