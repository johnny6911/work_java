package practice;

public class Employee {
	private String name;
	private int age;
	private String address;
	private String dept;
	private long salary;
	
	public Employee(String name, int age, String address, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.dept = dept;
	}
	
	public void printInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("주소: " + this.address);
		System.out.println("부서: " + this.dept);
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public void setWorkHours(int hourOfWorks) {}
}
