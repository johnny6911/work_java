package practice;

import java.util.Calendar;
import java.util.Scanner;

public class Test04 {

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("날짜(년), (월), (일)를 입력하세요");
       int year = scan.nextInt();
       int month = scan.nextInt();
       int day = scan.nextInt();
       
       Calendar c = Calendar.getInstance(); 

       c.set(Calendar.YEAR, year);
       c.set(Calendar.MONTH, month -1);
       c.set(Calendar.DATE, day);
       
       c.set(Calendar.DATE, c.get(Calendar.DATE)); 
       
       int dayOfweek = c.get(Calendar.DAY_OF_WEEK);
       switch(dayOfweek) {
       		case Calendar.SUNDAY:
       			System.out.println("일요일 입니다");
       			break;
       		case Calendar.MONDAY:
       			System.out.println("월요일 입니다");
       			break;
       		case Calendar.TUESDAY:
       			System.out.println("화요일 입니다");
       			break;
       		case Calendar.WEDNESDAY:
       			System.out.println("수요일 입니다");
       			break;
       		case Calendar.THURSDAY:
       			System.out.println("목요일 입니다");
       			break;
       		case Calendar.FRIDAY:
       			System.out.println("금요일 입니다");
       			break;
       		case Calendar.SATURDAY:
       			System.out.println("토요일 입니다");
       			break;
       }
       System.out.println(c.get(Calendar.YEAR) +"년 " + (c.get(Calendar.MONTH) +1)  +"월 "
                 + c.get(Calendar.DATE) + "일 " + c.get(Calendar.DAY_OF_WEEK));
       

   }

}
