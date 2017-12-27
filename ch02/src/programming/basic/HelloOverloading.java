package programming.basic;

public class HelloOverloading {
	public static void main(String[] args) {
		
		/*
		 * 메소드 오버로딩(Method Overloading) 호출조건
		 * 1. Argument(Parameter)의 개수가 일치
		 * 2. Argument의 타입이 일치할경우
		 */
		int sum = plus(10, 20);
		System.out.println(sum);
		
		double sum01 = plus(10.25, 20.10);
		System.out.println(sum01);
	}
	
	static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	static double plus(double a, double b) {
		double result = a + b;
		return result;
	}

}
