package Test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("킬로그램을 입력하시오 : ");
		double kg = input.nextInt();
		double k = kg * 1000000 / 453592;
		
		System.out.printf("파운드(pound): %.3f", k);
		
		input.close();
		
	}
	
}
