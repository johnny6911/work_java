package test;

public class Person8 {
	
	public String name;
	
	public Person8(){
		
	}
	public Person8(String name) {
		this.name =name;
	}
	
	public static void main(String[] args) {
		Person8 p = new Person8("예진");
		System.out.println(p.name);
		p = new Person8();
		p.name = "진태";
		System.out.println(p.name);
	}
}
