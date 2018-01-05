package Test;

public class Temporary extends Regular{

	public int workHour;
	public int hourPay = 10000;
	
	public Temporary(String name, int age, String address, String parts) {
		super(name,age,address,parts);
		this.name = name;
		this.age = age;
		this.address = address;
		this.parts = parts;
	}
	
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
		salary = workHour * hourPay;
	}
	
	public void printInfo() {
		System.out.print(" ");
		System.out.println();
	}
	
	public void printRegularInfo() {
		super.printInfo();
	}
	
	/*public static void main(String[] args) {
		Employee son = new Employee("손흥민","영국","네트웍스", 5500000);
		son.printInfo();
		
		Regular kim = new Regular("김신욱","한국","마케팅",5000000);
		kim.printInfo();
		
		Temporary lee = new Temporary("이영표", "미국", "관리부", 4000000);
		lee.printInfo();
		lee.printRegularInfo();
	}*/
	
}
