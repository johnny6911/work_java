package test;

public class Account6 {
	private String owner;
	private long balance;
	
	public Account6(String owner) {
		this.owner = owner;
	}
	public Account6(long balance) {
		this.balance = balance;
	}
	public Account6(String owner,long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	//7
	public long deposit(long amount) {
		return this.balance += amount;
	}
	
	public long withdraw(long amount) {
		if (this.balance < amount) {
			System.out.println("인출하려는 금액보다 잔액이 적습니다");
			return this.balance = 0;
		}
		return this.balance -= amount;
	}
	
	//100만원에서 150만원 저축해서 250만원이 되고 5만원을 추가로 저축하여 255만원
	public static void main(String[] args) {
		Account6 account = new Account6("홍길동", 1000000);
		System.out.println("현재 잔액: " + account.deposit(1500000));
		System.out.println("현재 잔액: " + account.withdraw(50000));
	}
}
