package test;

public class Test5 {
	
	private int salary = 1000000;
	
	public Test5() {
		
	}
	
	public Test5(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualGross() {
		int annualGross = salary * 12 ;
		annualGross += salary * 5;
		
		return annualGross;
	}
	
	 

	public static void main(String[] args) {
		Test5 a = new Test5(2_000_000);
		Test5 b = new Test5();
		
		System.out.println(b.getAnnualGross());
		System.out.println(a.getAnnualGross());
		
	}
}
