package practice8;

public class Ex07 {
	// 5.
	public static void main(String[] args) {
		PrintTime p1 = new PrintTime(3);
		Thread th1 = new Thread(p1, "안녕하세요");
		th1.setPriority(Thread.MAX_PRIORITY - 1); //MAX = 10
		th1.start();
		
		PrintTime p2 = new PrintTime(6);
		Thread th2 = new Thread(p2, "반가워여");
		th2.setPriority(Thread.NORM_PRIORITY - 1); // NORM = 5
		th2.start();
	}
}
