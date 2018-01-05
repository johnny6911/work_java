package inheritance.typecast;

public class InstanceOf {
	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432); // Person만 있음
		if (she instanceof Staff) { //if의 결과 false가 됨
			Staff st1 = (Staff) she;
		}
		else {
			System.out.println("she는 Staff 객체가 아닙니다");
		}
		
		Person p = new Staff("김상기",1187543, "강서대학교",3456);
		if(p instanceof Staff) { //다운캐스팅을 할떄는 무조건 instanceof를 쓴다
			System.out.println("p는 Staff 객체입니다.");
			Staff st2 = (Staff) p;
		}
	}
}
