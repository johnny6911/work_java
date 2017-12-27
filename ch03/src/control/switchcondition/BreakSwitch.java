package control.switchcondition;

import java.util.Scanner;

public class BreakSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("년의 월(month)를 입력: ");
		int month = input.nextInt();
		
		switch (month) {
			case 1:
			case 2:
			case 3:
				System.out.printf("%d월은 1분기 입니다. \n", month);
				break;
			case 4: case 5: case 6:
				System.out.printf("%d월은 2분기 입니다. \n", month);
				break;
				
			case 7: case 8: case 9:
				System.out.printf("%d월은 3분기 입니다. \n", month);
				break;
				
			case 10: case 11: case 12:
				System.out.printf("%d월은 4분기 입니다. \n", month);
				break;
				
			default:
				System.err.printf("월(month)를 잘못 입력했습니다.\n");
		}
	}
}
