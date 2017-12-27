package Test;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수 입력하셈 : ");
		
		int num = input.nextInt();
		
		int tenthu = num / 10000;
		System.out.println(tenthu);
		
		int chun = num % 10000 / 1000;
		System.out.println(chun);

		int hun = num % 1000 / 100;
		System.out.println(hun);
		
		int ten = num % 100 / 10;
		System.out.println(ten);
		
		int one = num % 10 / 1;
		System.out.println(one);
		
		System.out.printf("%d만 %d천 %d백 %d십 %d입니다 %n", tenthu,chun,hun,ten,one);
		
	}
}
