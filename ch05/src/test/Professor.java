package test;

public class Professor {
	String dept;
	int uNumber;
	
	public Professor(int uNumber) {
		this.uNumber = uNumber;
	}
	public Professor(String dept) {
		this.dept = dept;
	}
	public Professor(String dept, int uNumber) {
		this(dept);
		this.uNumber = uNumber;
	}
}
