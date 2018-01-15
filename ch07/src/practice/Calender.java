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
		int dayofweek = now.get(Calendar.DAY_OF_WEEK);

		System.out.println(now.getTime());
	
		System.out.print("오늘은 ");
		System.out.print(now.get(Calendar.YEAR) + "년 ");
		System.out.print(now.get(Calendar.MONTH) + 1 + "월 ");
		System.out.print(now.get(Calendar.DATE) + "일 ");
		System.out.print(Calender.getDayofweek(dayofweek));
		System.out.println("입니다 ");
		
		System.out.print("이 달의 ");
		System.out.println(countM + "번째 " + Calender.getDayofweek(dayofweek));
	
		
	
	}
	
		public static String getDayofweek(int dayofweek) {			
			switch(dayofweek) {
		   		case Calendar.SUNDAY:
		   			return "일요일";
		   		case Calendar.MONDAY:
		   			return "월요일";
		   		case Calendar.TUESDAY:
		   			return "화요일";
		   		case Calendar.WEDNESDAY:
		   			return "수요일";
		   		case Calendar.THURSDAY:
		   			return "목요일";
		   		case Calendar.FRIDAY:
		   			return "금요일";
		   		case Calendar.SATURDAY:
		   			return "토요일";
			}
			return null;
		}
}
