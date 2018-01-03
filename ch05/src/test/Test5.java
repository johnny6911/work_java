package test;

public class Test5 {
	private String owner;
	private long balance;
	
	public Test5(String owner) {
		this.owner = owner;
	}
	public Test5(long balance) {
		this.balance = balance;
	}
	public Test5(String owner,long balance) {
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
	
	
}
