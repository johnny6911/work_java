package Test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("ų�α׷��� �Է��Ͻÿ� : ");
		double kg = input.nextInt();
		double k = kg * 1000000 / 453592;
		
		System.out.printf("�Ŀ��(pound): %.3f", k);
		
		input.close();
		
	}
	
}
