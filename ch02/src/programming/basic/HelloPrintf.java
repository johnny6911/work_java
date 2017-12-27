package programming.basic;

public class HelloPrintf {
	public static void main(String[] args) {
		
		System.out.println("123456 123456 123456");
		System.out.println("--------------------");
		/*
		 * d(Decimal): 10����
		 * o(Octal): 8����
		 * h(hexadecimal), x:16����
		 */
		System.out.format("%6d %6o %6h %n", 10, 10, 10);
		System.out.format("%-6d %-6o %-6x %n" , 20, 20, 20);
		System.out.format("%+6d %6o %6H %n", 30, 30, 30);
		System.out.format("%1$6d %1$6o %1$6h %n", 128, 200);
		
		//$6�� 6�� 6ĭ(6�ڸ�)�� ǥ�� $�� , �ڿ� ù��° ���ڸ� ǥ��
		//.2�� �Ҽ� ��°�ڸ����� �ݿø��Ͽ� ǥ��
		//.3�� �Ҽ� ��°�ڸ����� �ݿø��Ͽ� ǥ��
		System.out.printf("%1$6.2f %1$6.3f %1$6.4f %n", 3.131592);
		
		System.out.format("%2$d %1$d", 100, 200);
	}
}
