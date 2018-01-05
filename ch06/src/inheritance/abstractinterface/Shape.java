package inheritance.abstractinterface;

//추상 클래스
public abstract class Shape {

	protected double x, y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// 일반 메소드
	public void drawCenter() {		// 일반 클래스
		System.out.println("(x, y) = " + x + ", " + y);
	}
	
	/*
	 * 메소드 몸체가 없는 이유
	 * -상속받은 클래스에서 구현을 하라는뜻
	 */
	public abstract void draw();	// 추상 메소드 (헤드부분만 있고) 바디가 없음
	
	public static void main(String[] args) {
		//Shape s - new Shape(3.1, 4.5); //객체화 오류 ,추상메소드가 구현이 아직 안되있기 때문에 객체화를 할수가 없다
		Shape s = new Circle(3.1, 4.5, 3.0);
		s.draw();
	}
	
}
