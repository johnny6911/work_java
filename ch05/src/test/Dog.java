package test;

public class Dog {
	public String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Dog a = new Dog("Doori");
		System.out.println(a.name);
	}
}
