package Test;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = input.nextInt();
		
		/* 방법 1
		int fiveman = money / 50000;
		System.out.println(fiveman);
		money = money - fiveman * 50000;
		
		int tthu = money / 10000;
		System.out.println(tthu);
		money = money - tthu * 10000;
		
		int fivechun = money / 5000;
		System.out.println(fivechun);
		money = money - fivechun * 5000;
		
		int chun = money / 1000;
		System.out.println(chun);
		*/
		
		int fiveMan = money / 50000;
		int man = money % 50000 / 10000;
		int fiveChun = money % 10000 / 5000;
		int chun = money % 5000 / 1000;
		System.out.printf("5만원권 %d개%n1만원권 %d개%n5천원권 %d개%n1천원권 %d%n",fiveMan,man,fiveChun,chun);
		
		input.close();
	}
}
