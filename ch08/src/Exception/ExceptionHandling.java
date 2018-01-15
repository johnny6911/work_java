package Exception;

public class ExceptionHandling {
	static int num[];
	
	public static void main(String[] args) {
		String str[] = {"안녕하세요" , "Hello"};
		
		try{ // 예외가 발생할만한곳에 트라이로 묶어줌
			System.out.println(str[0]);
			System.out.println(num.length);	// 예외발생
			System.out.println(str[2]);		// 앞서 예외발생으로 이 문장은 실행이 안됨
		}catch(Exception e ) { //Exceptin 대신 NullPointerException을 입력하면 num.length의 익셉션만 출력이 됨
			//System.out.println("예외 발생: " + e.toString());
			System.out.println("예외 발생: " + e);
			System.out.println("예외 발생 메시지: " + e.getMessage());
			/*System.out.println("예외관련 모든 메시지: " + e.printStackTrace());*/ // 오류발생 String + void인데 함께 정의될수 없음
			e.printStackTrace();
		}finally {
			System.out.println("try 실행");
		}
		
		System.out.println("프로그램이 정상적으로 종료됩니다.");
	}
}
