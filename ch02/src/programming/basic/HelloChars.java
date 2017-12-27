package programming.basic;

public class HelloChars {
	public static void main(String[] args) {
		System.out.println('a');		//char(캐릭터) 형
		System.out.println('\\');		// \ 출력
		
		// 8진수 142의 ASCII 코드 값(10진수 - 98의 ASCII 코드 값)
		System.out.println('\142');		
		
		System.out.println('\uAC00');	// UTF-8 = unicode 값 AC00 : 가.  AC는 16진수임
		System.out.println('\uAC01');	// Unicode 값 AC01 : 각
		System.out.println('강');
		
		System.out.print("Hello\nWorld\tHi\b\rABC\r\n"); // \n(엔더) 과 \t
		System.out.println("\'");
	}
}
