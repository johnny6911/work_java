package Test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("���� ��(month)�� �Է�: ");
		int month = input.nextInt();
		
		/*switch (month) {
			case 1:
			case 2:
			case 3: case 4: case 5: case 6:
			System.out.printf("%d���� ��ݱ��Դϴ�. \n", month);
			break;
			case 7: case 8: case 9: case 10: case 11: case 12:
			System.out.printf("%d���� �Ϲݱ��Դϴ�. \n", month);
			break;
			
			default:
				System.err.printf("��(month)�� �߸� �Է��߽��ϴ�. \n");
		}
		*/
		/*
		if (month > 0 && month <= 6) {
			System.out.println("��ݱ���");
		}
		else if (month >= 7 && month <= 12) {
			System.out.println("�Ϲݱ���");
		}
		*/
		
		//		month 6���� ũ�� �Ϲݱ� 6���� ���ų� ������ ��ݱ�
		String result = month > 6 ? "�Ϲݱ��Դϴ�" : "��ݱ��Դϴ�";
		
		System.out.println(result);
		
		input.close();
		
	}
	
}
