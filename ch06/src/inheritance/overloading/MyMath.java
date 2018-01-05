package inheritance.overloading;


public class MyMath {
	double x, y;
	
	public MyMath(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double multiply() {
		return x * y;
	}
	
	//static이 있으면 프로그램을 실행하자마자 메모리에 올라감
	public static double multiply(double a, double b) {
		return a * b;
		//return x * y;
		//return this.x * this.y;	//오류발생
	}
	
	public static void main(String[] args) {
		MyMath math = new MyMath(3.4, 6.7);
		System.out.println(math.multiply()); //multiply라는 객체를 만듬
		System.out.println(MyMath.multiply(3.4, 6.7));
	}
}
