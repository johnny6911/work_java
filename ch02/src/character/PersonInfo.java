package character;

import java.util.Scanner;

public class PersonInfo {

	static int weight;
	static double height;
	
		public static void main(String[] args) {
			System.out.print("Ű�� ������ ����");
			
			Scanner x = new Scanner(System.in);
			
				weight = x.nextInt();
				height = x.nextDouble();
				System.out.printf("������: %dkg, Ű: %.1fcm", weight, height);
				
				x.close();
		}
}
