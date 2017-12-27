package character;

import java.util.Scanner;

public class PersonInfo {

	static int weight;
	static double height;
	
		public static void main(String[] args) {
			System.out.print("虐唱 个公霸 ぁぁ");
			
			Scanner x = new Scanner(System.in);
			
				weight = x.nextInt();
				height = x.nextDouble();
				System.out.printf("个公霸: %dkg, 虐: %.1fcm", weight, height);
				
				x.close();
		}
}
