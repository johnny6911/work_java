package Test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("�Ǽ��� �Է��ϼ� : ");
		int a = (int)input.nextInt();
		int b = (int)input.nextInt();
		
		/*
		 * a�� b�� ����  int���̰�
		 * double sum ������ ������� �� �ڵ����� double ������ ����ȴ�
		 * 
		 * sum�� int�� �� ������ ������ ����� double���̰�
		 * ���������� double avg������ ���� �־��� ������ �ڵ����� double������ ����ȴ�
		 */
		
		double c = a + b;
		double d = c / 2;
		
		
		
		System.out.printf("��: %.2f, ���: %.2f %n", c, d);
		
	}
	
}
