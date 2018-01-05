package Test;

public class Employee {
	
	public String name;
	public int age;
	public String address;
	public String parts;
	public int salary;
	
	
	public Employee() {
		
	}

	public Employee(String name, String address, String parts, int salary, int age){
		this.name = name;
		this.address = address;
		this.parts = parts;
		this.salary = salary;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("이름 :" + name + " 나이 :" + age + " 주소 :" + address + " 부서: " + parts);
	}
}
