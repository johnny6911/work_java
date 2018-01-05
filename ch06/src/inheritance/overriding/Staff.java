package inheritance.overriding;

public class Staff extends Faculty {
	
	public String division;

	public Staff(String name, long number, String univ, long idNumber, String division) {
		super(name, number, univ, idNumber);
		this.division = division;
	}
	
	@Override
	public void printInfo() {
		System.out.print("이름: " + super.name + " 주민번호: " + super.getSNumber());
		System.out.print(" 대학: " + this.univ + " 직원번호: " + super.number);
		System.out.println(" 부서: " + this.division);
	}
	
	public void printFacultyInfo() {
		super.printInfo();
	}
	
	public static void main(String[] args) {
		Person she = new Person("이소라",2056432);
		she.printInfo();
		
		Faculty i = new Faculty("김영태", 1145782, "연한대학교", 38764);
		i.printInfo();
		
		Staff he = new Staff("최영기",1167429,"남도대학교",1287,"기획처");
		he.printInfo(); //최상위 부모부터 가서 printInfo의 메소드부터 확인하고 Faculty의 메소드도 확인하고 순서대로 출력
		he.printFacultyInfo();
	}
}
