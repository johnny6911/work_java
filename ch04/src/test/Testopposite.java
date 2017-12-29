package test;

public class Testopposite {
	public static void main(String[] args) {
		
		int i, j;
		
		for ( i= 1; i <= 9; i++) {
			for (j = 2; j <= 9; j++) {
				System.out.printf("%d * %d =%02d "+"  ", j, i, i * j);
			}
			System.out.println();
		}	
		
	}
}
