package inheritance.overriding;

public class Person {
	public String name;
	public long number;
	
	public Person(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}

	//오버라이드 된 메소드가 아니므로 @Override하면 오류가남
	public void printInfo() {
		System.out.println("이름: " + name + " 주민번호: " + number);
	}
	
}
