package practice;

public class Regular extends Employee {

	public Regular(String name, int age, String address, String dept) {
		super(name, age, address, dept);
	}
	
	public void setSalary(long salary) {
		super.setSalary(salary);
	}
	
	@Override
	public void printInfo() {
		System.out.println("정규직: " + super.getSalary());
	}
}
