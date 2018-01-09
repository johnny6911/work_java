package com.koitt.java.ch07;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarTest {
	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		now.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 월 시작이 0부터 시작이기에 1을 더해준다
		int date = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.print(year + "년 " + month + "월 " + date + "일 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}
