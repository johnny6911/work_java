package obj.basic;

public class CreditCardTest {
	
	public static void main(String[] args) {
		CreditCard yourCard = new CreditCard();
		
		yourCard.owner = new String("이민정");//메모리구조에서 owner는 같은 heap 영역 안의 "이민정"을 가르키게된다
		System.out.println(", 카드소유자: " + yourCard.owner);
		yourCard.use(150000);
		yourCard.use(100000);
		yourCard.paybill(100000);
		
		CreditCard myCard = new CreditCard();
		myCard.owner = "이민정"; //owner가 실제 주소값이다
		
		// 주소값 비교
		if (yourCard.owner == myCard.owner) {
			System.out.println("둘의 주소값은 같다");
		}
		else {
			System.out.println("둘의 주소값은 다르다");
		}
		
		// 문자열이 같은지 비교: String의 equals() 메소드 이용
		if(yourCard.owner.equals(myCard.owner)) {
			System.out.println("둘의 문자열은 같다.");
		}
		else {
			System.out.println("둘의 문자열은 다르다");
		}
	}
}
