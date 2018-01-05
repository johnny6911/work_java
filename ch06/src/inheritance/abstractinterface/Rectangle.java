package inheritance.abstractinterface;

public class Rectangle extends Shape {
	double width;
	double height;
	
	//생성자 단축키 알트 + 쉬프트 + s 제너레잇 유징 필드
	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		super.drawCenter();
		System.out.printf("가로: %f, 세로: %f, ", width, height);
		System.out.printf("사각형 면적: %f\n", width*height);
	}
}
