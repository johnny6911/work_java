package Test;

import java.util.Scanner;

public class Test9 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double height = input.nextDouble();
		double weight = input.nextDouble();
		
		if (weight <= ((height - 100) * 0.9)) {
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("�� �Դϴ�");
		}
		
		
	}
	
}
