package obj.basic;


public class CreditCard {

	private long number;	// 16자리 카드번호
	public String owner;	// 카드 소유자
	private int point;		// 카드 포인트
	private int balance;		// 현재까지 사용액
	
	//카드 사용 메소드
	public void use(int amount) {
		this.balance += amount;
		System.out.println("현재 카드 사용액: " + this.balance);
		//this.addPoint(amount);
	}
	
	
	//카드 비용 지불 메소드
	public void paybill(int amount) {
		this.balance -= amount;
		System.out.println("지불액: " + amount + " 지불잔액: " + this.balance);
		this.addPoint(amount);
	}
	
	//카드 포인트 추가 메소드
	private void addPoint(int amount) {
		this.point += amount/1000;
		System.out.println("보너스 포인트: " + this.point);
	}
	
	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "이수강";
		System.out.print("카드번호: " + myCard.number);
		System.out.println(", 카드소유자: " + myCard.owner);
		myCard.use(30000);
		myCard.paybill(10000);
		//myCard는 위 use 필드의 this.을 뜻한다
		CreditCard yourCard = new CreditCard();
		yourCard.use(50000);
	}
}
