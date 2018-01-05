package Test;

public class Regular extends Employee{
	
	public int salary;
	
	public Regular(String name, int age, String address, String parts) {
		super();
		this.salary = salary;
		this.name = name;
		this.age = age;
		this.address = address;
		this.parts = parts;
	}
	

	public void setSalary(int salary) {
		this.salary = salary;
	}



	public void printInfo() {
		System.out.print("이름 :" + this.name + " 나이 :" + this.age + " 주소 :" + this.address + " 부서: " + this.parts);
		System.out.println("정규직 : " + salary);
	}
	
}
