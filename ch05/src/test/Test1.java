package test;

public class Test1 {
	private String major;
	private int studentn;
	
	public Test1() {
		
	}
	
	public Test1(String major) {
		this.major = major;
	}
	
	public Test1(int studentn) {
		this.studentn = studentn;
	}
	
	public Test1(String major,int studentn) {
		this.major = major;
		this.studentn = studentn;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStudentn() {
		return studentn;
	}

	public void setStudentn(int studentn) {
		this.studentn = studentn;
	}

	public static void main(String[] args) {
		Test1 student = new Test1("과학",12345678);
		System.out.println("과: " + student.getMajor());
		System.out.println("학번: " + student.getStudentn());
		
		Test1 s2 = new Test1();
		s2.setMajor("연기과");
		s2.setStudentn(200);
		System.out.println("과: " + s2.getMajor() + "학번: " + s2.getStudentn());
	}
	
}
