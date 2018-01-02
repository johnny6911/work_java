package obj.setter;

public class CreditCard {
	public String owner;	// 카드 소유자
	private long number;	// 16자리 카드번호
	private int point;		// 카드 포인트
	private int balance;		// 현재까지 사용액
	
	//카드 사용 메소드
	public void use(int amount) {
		this.balance += amount;
	}
	
	
	//카드 비용 지불 메소드
	public void paybill(int amount) {
		this.balance -= amount;
		this.addPoint(amount);
	}
	
	//카드 포인트 추가 메소드
	private void addPoint(int amount) {
		this.point += amount/1000;
	}

	/*
	 *  setter & getter (캡슐화)
	 *  setter, getter 만들기 단축기: alt + shift + S
	 */
	
	// setter & getter

	public long getNumber() {
		return number;
	}


	public void setNumber(long number) {
		this.number = number;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	

	
	
	
}
