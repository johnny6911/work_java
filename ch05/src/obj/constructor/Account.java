package obj.constructor;

public class Account {
	public String owner;
	public long balance;
	
	//생성자 구현
	public Account(String owner) {
		this.owner = owner;
	}
	
	public Account(long balance) {
		this.balance = balance;
	}
	
	public Account(String owner, long balance) {
		
		this(owner); // this는 Account의 객체, this는 자기자신, super은 부모
		//this(balance);
		//this.owner = owner;
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		Account art1 = new Account("최여진");
		Account art2 = new Account(100000);
		art2.owner = "홍혜빈";
		Account art3 = new Account("신세경", 200000);
		
		System.out.printf("art1: %s %d %n", art1.owner, art1.balance);
		System.out.printf("art2: %s %d %n", art2.owner, art2.balance);
		System.out.printf("art3: %s %d %n", art3.owner, art3.balance);
	}
}
