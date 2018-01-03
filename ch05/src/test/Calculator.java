package test;

public class Calculator {
	public static double add(double x, double y) {
		return x + y;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(3.4, 6.7));
	}
}
