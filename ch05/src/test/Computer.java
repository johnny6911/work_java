package test;

public class Computer {
	public final String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
	
	private int indexOfOs;	// osType의 인덱스
	private int memory;		// 메모리 크기
	
	//생성자
	public Computer(int indexOfOs, int memory) {
		this.indexOfOs = indexOfOs;
		this.memory = memory;
	}
	
	public void print() {
		System.out.println("운영체제: " + osType[this.indexOfOs] + ", 메인메모리: " + this.memory); //this는 생략해도됨
	}
	
	public static void main(String[] args) {
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		pc.print();
		apple.print();
		galaxy.print();
	}
}
