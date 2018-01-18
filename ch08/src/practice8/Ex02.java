package practice8;

public class Ex02 {
	public static void main(String[] args) {
		
		// 10.
		BankAccount ba = new BankAccount(-100000);
		
		// 11.
		try {
			ba.withdraw(500000);
		}catch(InvalidWithdraw e) {
			System.out.println(e.getMessage());
		}
	}
}
