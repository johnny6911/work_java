package practice8;

public class Ex03 {
	public static void main(String[] args) {

		//1.
		BankAccount ba = new BankAccount(-100000);
		ba.deposit(100000);
		ba.withdraw(100000); // 인출 10만원

		//2.
		try {
			ba.withdraw(200000); // 현재 잔금은 0인데 200000을 빼면 -200000이기에 최저잔금인 -100000을 초과하여 익셉션 발생
		}
		catch (InvalidWithdraw e) {
			System.out.println(e.getMessage());
		}
	}
}
