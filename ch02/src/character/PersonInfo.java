package character;

import java.util.Scanner;

public class PersonInfo {

	static int weight;
	static double height;
	
		public static void main(String[] args) {
			System.out.print("키나 몸무게 ㄱㄱ");
			
			Scanner x = new Scanner(System.in);
			
				weight = x.nextInt();
				height = x.nextDouble();
				System.out.printf("몸무게: %dkg, 키: %.1fcm", weight, height);
				
				x.close();
		}
}
