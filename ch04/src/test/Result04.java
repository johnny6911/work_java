package test;

public class Result04 {
	public static void main(String[] args) {
		int n = 10;
		
		for (int i = 1; i <= n; i++) {
			int mult = 1;
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d",j);
				String str = j ==i ? " = " : " * ";
				System.out.printf("%d",str);
				mult *= j;
			}
			System.out.printf("%d\n",mult);
		}
		
	}

}
