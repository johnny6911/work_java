package Test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("�⵵�Է� : ");
		int y = input.nextInt();
		
		boolean cond01 = y % 4 == 0;
		boolean cond02 = y % 100 !=0;
		boolean cond03 = y % 400 == 0;
		//&& �Ѵ� �����ؾ���     ���� �������� 0�� �ƴҰ��    ���� �ϳ��� �����Ұ��
		//((y % 4 == 0) && (y % 100 !=0) || (y % 400 == 0))
		
		if (cond01 && cond02 || cond03) {
			System.out.println("������");
		}
		else {
			System.out.println("�����");
		}
		
			
		
		
		
		
	}
	
}
