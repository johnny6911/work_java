package practice;

public class Person {
	
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		//1. Argument의 객체와 나 자신의 주소값을 비교
		if (this == obj) {
			return true;
		}
		
		//2. Argument의 객체가 이 클래스를 상속받고 있는지 검사
		if ((obj instanceof Person)) {
			return false;
		}

	
		//3. 실제 name 필드값이 같은지 비교
		Person p = (Person)obj;	// obj의 name 필드에 접근하기 위해 다운캐스팅
		if (this.name.equals(p.name)) { // 실제 name 필드값 끼리 비교 object에 있는 equals를 상속받아 오버라이딩한것
			return true;
		}
		
		return false; //boolean의 기본값이 false이기 때문에 기본 리턴값은 false로 한다
	}
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최영태")));
		
	}
	
}
