package character;

import java.util.Scanner;

public class ToDigit {
	public static void main(String[] args) {
	
		Scanner x = new Scanner(System.in);
		int s = x.nextInt();
		//$�� �ڸ��� ǥ����  ex) 1$�� �ϳ��� ǥ��
			System.out.printf("%1$o%n%1$d%n%1$h%n", s);
			
		x.close();
	}
		
}
