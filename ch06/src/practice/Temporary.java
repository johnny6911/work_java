package practice;

public class Temporary extends Employee {
	
	private int workHours;				// 일한시간
	private int payOfHours = 10000;		// 시간당 보수

	public Temporary(String name, int age, String address, String dept) {
		super(name, age, address, dept);
	}
	
	@Override
	public void setWorkHours(int hourOfWorks) {
		this.workHours = hourOfWorks;
		super.setSalary(this.workHours * this.payOfHours);
	}
	
	@Override
	public void printInfo() {
		System.out.println("비정규직: " + this.workHours + " / " + super.getSalary());
	}
	
	public static void main(String[] args) {
		/*Regular r = new Regular("이순신", 35, "서울", "인사부");
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");*/
		
		Employee r = new Regular("이순신", 35, "서울", "인사부");
		Employee t = new Temporary("장보고", 25, "인천", "경리부");
		
		r.setSalary(5000000);
		r.printInfo();
		t.setWorkHours(120);
		t.printInfo();
	}
}
