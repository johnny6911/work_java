package test;

public class GuGudan {
	public static void main(String[] args) {
		
		int i, j;
		//2단부터 9단까지 반복
		for (i= 2; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				//System.out.printf("%d * %d =%2d "+" " + " ", i, j, i* j);
				System.out.print(i + " * " + j + " = " + (i * j + "\t"));
			}
			System.out.println();
		}	
	}
}
