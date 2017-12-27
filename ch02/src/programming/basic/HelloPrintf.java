package programming.basic;

public class HelloPrintf {
	public static void main(String[] args) {
		
		System.out.println("123456 123456 123456");
		System.out.println("--------------------");
		/*
		 * d(Decimal): 10진수
		 * o(Octal): 8진수
		 * h(hexadecimal), x:16진수
		 */
		System.out.format("%6d %6o %6h %n", 10, 10, 10);
		System.out.format("%-6d %-6o %-6x %n" , 20, 20, 20);
		System.out.format("%+6d %6o %6H %n", 30, 30, 30);
		System.out.format("%1$6d %1$6o %1$6h %n", 128, 200);
		
		//$6의 6은 6칸(6자리)를 표시 $는 , 뒤에 첫번째 숫자를 표시
		//.2는 소수 둘째자리까지 반올림하여 표시
		//.3는 소수 셋째자리까지 반올림하여 표시
		System.out.printf("%1$6.2f %1$6.3f %1$6.4f %n", 3.131592);
		
		System.out.format("%2$d %1$d", 100, 200);
	}
}
