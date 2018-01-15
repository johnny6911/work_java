package Exception;

public class ExceptionType2 {
	public static void main(String[] args) {
		String[] str = {"안녕하세요", "hello"};
		
		System.out.println(str[0]);
		System.out.println(str[2]); // 배열의 인덱스 번호가 범위를 벗어났기에 예외발생
		System.out.println(str[1]);
	}
}
