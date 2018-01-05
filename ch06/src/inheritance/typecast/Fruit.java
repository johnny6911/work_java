package inheritance.typecast;

public class Fruit {
	public static void main(String[] args) {
		
		Fruit f = new Fruit(); // Fruit(부모 클래스)에 대한 객체를 만듬
		System.out.println(f instanceof Fruit);
		System.out.println(f instanceof Apple); // 부모는 자식이 될수없음
		System.out.println(f instanceof Pear);
		
		Fruit fa = new Apple();
		System.out.println(fa instanceof Fruit); //Fruit를 상속받음
		System.out.println(fa instanceof Apple); //자기자신도 됨
		System.out.println(fa instanceof Grape);
		
		Apple a = new Apple();
		System.out.println(a instanceof Fruit); //상속받은 부모므로 true
		System.out.println(a instanceof Apple); //자기자신이라 true
		//System.out.println(a instanceof Grape);	// 컴파일 오류남 (Apple과 Grape는 상속관계가 아니고 동등한 관계므로 오류)
		
	}
}

class Apple extends Fruit{
	
}

class Pear extends Fruit{
	
}

class Grape extends Fruit{
	
}

