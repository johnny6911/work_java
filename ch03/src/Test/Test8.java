package Test;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("세 수를 입력하세요 >> ");
		
		int num01 = input.nextInt();
		int num02 = input.nextInt();
		int num03 = input.nextInt();
		
		int res = num01 > num02 ?
				(num01 > num03 ? num01 : num03) : (num02 > num03 ? num02 : num03);
		
		System.out.println("가장 큰수 : " + res); 
		
			
		
	}
	
}
