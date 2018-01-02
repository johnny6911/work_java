package obj.field;

public class CreditCard {
	/*
	 * 접근 제한자
	 * - private: 같은 클래스 내에서만 사용가능
	 * - (default): 같은 패키지(폴더) 내에서만 사용가능
	 * - protected: default 범위 + 상속받은 클래스까지 사용가능
	 * - public: 어디든 사용가능
	 */
	private long number;	// 16자리 카드번호
	public String owner;	// 카드 소유자
	
	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		
		/*
		 * 클래스의 필드는 자동으로 기본값으로 초기화 된다(null, 0 등)
		 * 단, 지역변수 (local variable)는 수동으로 기본값을 초기화 해야한다.
		 */
		System.out.println("기본값: " + myCard.number + ", " + myCard.owner);
		
		/*
		 * 
		 */
		String local; // 지역변수 - 선언만 하고 초기화를 하지 않은 경우, local이라는 변수는 초기화를 안해주었기에 사용할수없다
		//값부터 넣어주면 주소값이 설정된다
		myCard.number = 3456_7654_8765_5647L; // 클래스 영역
		myCard.owner = "유 재석"; // 클래스 영역
		System.out.print(", 카드소유자: " + myCard.owner);
		System.out.println(", 카드소유자: " + myCard.owner);
	}
}
