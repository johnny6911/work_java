package practice;

import java.util.Calendar;

public class Calender {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 월 시작이 0부터 시작이기에 1을 더해준다
		int date = now.get(Calendar.DATE);
		
		String a = "수요일";
		
		System.out.println("오늘은 " + year + " 년 " + month + " 월 " + date + " 일 " 
							+ a + "입니다");
		
		int countM = now.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int countW = now.get(Calendar.WEEK_OF_MONTH);
		int countD = now.get(Calendar.DAY_OF_YEAR);
		int countYearWeek = now.get(Calendar.WEEK_OF_YEAR);
		
		System.out.println("이 달의 " + countM + "번째 " + a + "입니다");
		System.out.println("이 달의 " + countW + "번째 주입니다");
		System.out.println("이 해의 " + countD + "일입니다");
		System.out.println("이 해의 " + countYearWeek + "번째 주입니다");
		
	}
}
