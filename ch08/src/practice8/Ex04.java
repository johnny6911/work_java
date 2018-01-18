package practice8;

public class Ex04 extends PrimeNumber02 {

	Ex04(int first,String name) {
		super(first, name);
	}

	public static void main(String[] args) {

		PrimeNumber02 b = new PrimeNumber02(20, "소수 만드는 스레드");
		//Thread t = new Thread(b);
		b.start();

	}
}

			
		class PrimeNumber02 extends Thread {
			public int first;
			
			PrimeNumber02(int first, String name) {
				setName(name);
				this.first=first;
			}
		


	public void run() {

		String formal = "2";

		for (int i = 3; i <= first; i++) {
			for (int j = 2; j < i; j++) {
				if(i % j == 0){
					j = i;
				}

				if(i == j + 1){
					formal += " " + i;
				}
			}
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(formal);
	}
}

