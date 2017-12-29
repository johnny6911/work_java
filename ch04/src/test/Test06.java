package test;

public class Test06 {
	public static void main(String[] args) {
		
			for (int degree = -60; degree <= 140; degree += 20) {
				double f = (9.0 / 5.0) * degree + 32;
				System.out.printf("섭씨온도: %d, 화씨온도: %.2f%n", degree, f);
			}
			
	}
}
