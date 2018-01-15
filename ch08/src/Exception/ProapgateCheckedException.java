package Exception;

public class ProapgateCheckedException {
	//메소드 선언에서 다시 예외 ClassNotFoundException의 발생을 전달
	public static void main(String[] args) throws ClassNotFoundException { //main위에 있는 메소드는 없기
		//메소드 Class.forName()을 사용하려면 반드시 예외처리를 해야함
		Class<?> forName = Class.forName("java.lang.Objec");
		System.out.println(forName);
	}
}
