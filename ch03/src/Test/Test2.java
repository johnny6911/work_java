package Test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("실수를 입력하셈 : ");
		int a = (int)input.nextInt();
		int b = (int)input.nextInt();
		
		/*
		 * a와 b의 합은  int형이고
		 * double sum 변수에 집어넣을 때 자동으로 double 형으로 변경된다
		 * 
		 * sum은 int형 를 나눴기 때문에 결과는 double형이고
		 * 마찬가지로 double avg변수에 집어 넣었기 때문에 자동으로 double형으로 변경된다
		 */
		
		double c = a + b;
		double d = c / 2;
		
		
		
		System.out.printf("합: %.2f, 평균: %.2f %n", c, d);
		
	}
	
}
