package inheritance.abstractinterface;

public interface Connectable {
	
	//상수정의
	/*public abstract*/ static final String name = "연결 방법: USB"; //인터페이스는 무조건 public이 자동으로 붙는다
	
	//추상 메소드 선언
	/*public abstract*/ void connect();
}
