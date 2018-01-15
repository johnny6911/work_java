package character;

import java.util.Scanner;

public class ToDigit {
	public static void main(String[] args) {
		System.out.println("정수를 입력하시오: ");
		Scanner x = new Scanner(System.in);
		int s = x.nextInt();
		//$는 자리를 표시함  ex) 1$는 하나를 표시
			System.out.printf("%1$o%n%1$d%n%1$h%n", s);
			
		x.close();
	}
		
}
