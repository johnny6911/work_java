package Test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("년의 월(month)를 입력: ");
		int month = input.nextInt();
		
		/*switch (month) {
			case 1:
			case 2:
			case 3: case 4: case 5: case 6:
			System.out.printf("%d월은 상반기입니다. \n", month);
			break;
			case 7: case 8: case 9: case 10: case 11: case 12:
			System.out.printf("%d월은 하반기입니다. \n", month);
			break;
			
			default:
				System.err.printf("월(month)를 잘못 입력했습니다. \n");
		}
		*/
		/*
		if (month > 0 && month <= 6) {
			System.out.println("상반기임");
		}
		else if (month >= 7 && month <= 12) {
			System.out.println("하반기임");
		}
		*/
		
		//		month 6보다 크면 하반기 6보다 같거나 작으면 상반기
		String result = month > 6 ? "하반기입니다" : "상반기입니다";
		
		System.out.println(result);
		
		input.close();
		
	}
	
}
