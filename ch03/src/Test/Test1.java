package Test;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("실수를 입력하세요 : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double result = a + b;
		double result2 = result / 2;
		
		System.out.printf("합: %.2f, 평균: %.2f %n", result,result2);
		
		input.close();
		
		
		
	}
}
