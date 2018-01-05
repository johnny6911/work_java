package inheritance.overriding;

public class Faculty extends Person{
	public String univ;
	public long number;	// 사원번호
	
	public Faculty(String name, long number,String univ, long idNumber) {
		super(name,number);
		this.univ = univ;
		this.number = idNumber;
	}
	

	public long getSNumber() {
		return super.number; //Person의 넘버(주민번호)를 불러와야하기떄문에 super을 씀
	}


	public void setSNumber(long number) {
		this.number = number;
	}
	

	@Override
	public void printInfo() {
		System.out.print("이름: " + super.name + " 주민번호: " + super.number); // super의 넘버는 person의 주민번호를 의미
		System.out.println(" 대학: " + this.univ + " 직원번호: " + this.number); // this는 자기자신이므로 사원번호를 의미
	}
	

}
