package test;

public class Test1 {
	public static void main(String[] args) {
		
		int count = 1;
		for (int i = 1; i <= 100; i++) {
			
			if ((i%2 != 0) && (i%3 != 0) && (i%5 != 0) && (i%7 != 0)){
				//System.out.println();
				System.out.print(i + " ");
				count++;
				
				if (count == 10) {
					System.out.println();
					count = 0;
				}
			}	
		}
	}
}
