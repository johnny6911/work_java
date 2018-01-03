package obj.field;

public class Circle {
	public double radius;
	public static final double PI = 3.141592;
	
	//생성자 구현
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return radius * radius * PI; //원넓이 구하는 공식임
		//return radius * radius * Circle.PI;	//OK
		//return radius * radius * this.PI;		//오류 발생
		
	}
	
	//현재 반지름을 사용하여 원의 둘레 길이를 구하는 메소드
	public double getCircumference() {
		return 2 * PI * this.radius;
	}
	
	// 주요 정보 출력
	public void print() { 
		System.out.printf("반지름이 %.2f인 원의 면적은 %.2f이고. %n", radius, this.getArea());
		System.out.printf("둘레 길이는 %.2f이다 %n", this.getCircumference());
	}
	
	public static void main(String[] args) {
		System.out.println("원주율: " + Circle.PI);
		
		Circle c1 = new Circle(2.78);
		c1.print();
		
		Circle c2 = new Circle(5.25);
		c2.print();
		
	}
}
	
