package character;

import java.util.Scanner;

public class ToPound {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double k = input.nextDouble();
		System.out.println("����: " + k + "kg");
		
		double pound = k * 2.2;
		System.out.println("����: " + pound + "lb");
		
		input.close();
	}
}
