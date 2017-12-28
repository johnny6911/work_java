package test;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >> ");
		String num = input.next();
		
		/*for (int i = num.length() - 1; i >= 0; i--)
			char result = num.charAt(i);
			System.out.print(result);
			*/
		int i = num.length() -1;
		do {
			char result = num.charAt(i);
			System.out.print(result);
			i--;
		} while (i >= 0);
		
		input.close();	
		
	}
}
