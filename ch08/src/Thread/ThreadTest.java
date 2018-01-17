package Thread;

class IncThread extends Thread{
	public IncThread(String name) {
		this.setName(name); // 스레드 이름 입력
	}


	public void run() {
		for(int i = 1; i < 5; i++) {
			try {
				sleep(50);
				System.out.print(getName() + ": " + i); //50 밀리초 동안에 잠깐 쉬어라 ( 1000밀리초 = 1초)
				System.out.println(", 활성화된 스레드 수: " + activeCount());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Decthread extends Thread {
	@Override
	public void run() {
		for(int i = 5; i>1; i--) {
			try {
				Thread.sleep(50);	
				System.out.print(this.getName() + ": " + i);
				System.out.println(", 활성화된 스레드 수: " + Thread.activeCount());
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		IncThread inc = new IncThread("증가 스레드");
		inc.start();
		Decthread dec = new Decthread();
		dec.start();
	}
}
