package practice;

public class Complex {
	
	private double a;	// 실수부
	private double b;	// 허수부
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public static Complex add(Complex c1, Complex c2) {
		int c1A = (int)(c1.a * 10.0);
		int c1B = (int)(c1.b * 10.0);
		int c2A = (int)(c2.a * 10.0);
		int c2B = (int)(c2.b * 10.0);
		
		Complex c = new Complex((c1A + c2A) / 10.0, (c1B + c2B) / 10.0);
		return c;
	}
	
	public static Complex sub(Complex c1, Complex c2) {
		int c1A = (int)(c1.a * 10.0);
		int c1B = (int)(c1.b * 10.0);
		int c2A = (int)(c2.a * 10.0);
		int c2B = (int)(c2.b * 10.0);
		
		Complex c = new Complex((c1A - c2A) / 10.0, (c1B - c2B) / 10.0);
		return c;
	}
	
	public double abs() {
		return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
	}
	
	public String print() {
		return this.a + " + " + this.b + "i";
	}
	
	public static void main(String[] args) {
		Complex x = new Complex(3.4, 4.5);
		Complex y = new Complex(5.2, -2.4);
		
		Complex res1 = Complex.add(x, y);
		Complex res2 = Complex.sub(x, y);
		
		System.out.println("더한 결과: " + res1.print());
		System.out.println("뺀 결과: " + res2.print());
		
		System.out.println("x의 절대값: " + x.abs());
		System.out.println("y의 절대값: " + y.abs());
	}
}
