package practice8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		int x =0, y=0, z=0;
		Scanner input = new Scanner(System.in);
		System.out.println("=정수 두 개 입력=");
		while(true) {
			try {
				System.out.println("첫번째 정수 입력: ");
				x = Integer.parseInt(input.nextLine());
				
				System.out.println("두번째 정수 입력: ");
				y = Integer.parseInt(input.nextLine());
				
				z = x * y;
				System.out.printf("%d * %d = %d %n", x, y, z);
				break;
			}
			catch (NumberFormatException e) {
				System.out.println("정수만 입력해주세요.");
				continue;
			}
		}
	}
}
