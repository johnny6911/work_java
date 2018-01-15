package Exception;

public class CheckedException {
	public static void main(String[] args) {
		//메소드 Class.forName()을 사용하려면 반드시 예외처리를 해야 함
		//forName은 내용을 찾아서 클래스 포네임에 넣어주는것임 
		Class<?> forName = null; //지역변수는 무조건 초기화 해주어야한다
		try {
			forName = Class.forName("java.lang.Object"); // 컴파일 오류 , <?>는 어떤타입이 확정되지 않았을때 ?를 집어넣는다
		} catch (ClassNotFoundException e) {
			/*
			 *  자동 완성의 폐해
			 *  printStackTrace()는 예외에 대한 상세한 정보를 콘솔에 출력하기 때문에,
			 *  프로그램 배포시에는 꼭 막아야 한다
			 *  (Debug 용으로만 제발!!! 사용 바랍니다)
			 */
			e.printStackTrace();
		}
		System.out.println(forName); // 
		
	}
}
