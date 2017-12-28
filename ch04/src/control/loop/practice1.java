package control.loop;

public class practice1 {
	public static void main(String[] args) {
		
		int [] a = {3, 7, 8, 9};
		int [] b = {23, 72, 97};
		a = b;
		
		for (int value: a)
			System.out.print(value + " ");
		System.out.println();
	}
}
