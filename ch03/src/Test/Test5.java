package Test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("년도입력 : ");
		int y = input.nextInt();
		
		boolean cond01 = y % 4 == 0;
		boolean cond02 = y % 100 !=0;
		boolean cond03 = y % 400 == 0;
		//&& 둘다 만족해야함     나눈 나머지가 0이 아닐경우    둘중 하나만 만족할경우
		//((y % 4 == 0) && (y % 100 !=0) || (y % 400 == 0))
		
		if (cond01 && cond02 || cond03) {
			System.out.println("윤년임");
		}
		else {
			System.out.println("평년임");
		}
		
			
		
		
		
		
	}
	
}
