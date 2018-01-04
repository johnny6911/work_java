package test;

public class Test4 {
	
	private int salary = 1000000;
	
	public Test4() {
		
	}
	
	public Test4(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualGross() {
		int annualGross = salary * 12 ;
		annualGross += salary * 5;
		
		return annualGross;
	}
	
	 

	public static void main(String[] args) {
		Test4 a = new Test4(2_000_000);
		Test4 b = new Test4();
		
		System.out.println(b.getAnnualGross());
		System.out.println(a.getAnnualGross());
		
	}
}
