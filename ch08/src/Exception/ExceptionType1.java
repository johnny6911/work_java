package Exception;

public class ExceptionType1 {
	static int[] num; // num이라는 변수를 초기화를 안했기때문에 렌스를 몇칸인지 알수가 없기에 예외발생
	
	public static void main(String[] args) {
		System.out.println(num.length); // 예외발생
	}
}
