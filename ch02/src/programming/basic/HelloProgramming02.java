package programming.basic;

public class HelloProgramming02 {
	//static 변수는 전역변수 클래스 전체에서 실행이됨
	//(Global Variable)
	static String hello = "안녕하세여";
	static String hello02 = "안녕?";
	
	public static void main(String[] args) {
		//지역변수 main에서만 실행이됨
		/*Local Variable
		 dddd*/
		String hello2 = "hello! guys";
	
		System.out.println(hello2);
		chul09(hello2);
	}
	/* 블록  컨트롤 + 쉬프트 + 슬레쉬 혹은 역슬레쉬는
	 * 주석을 지정 혹은 해제 해줌
	 */
	static void chul09(String pika) {
		System.out.println(pika);
		System.out.println(pika);
		
	}
}

// JavaDoc 타입 주석
/**
 * 
 *@나는 나다
 * @
 */
