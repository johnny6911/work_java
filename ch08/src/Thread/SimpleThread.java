package Thread;

class MyThread extends Thread{ //스레드를 사용하기 위해 상속받아옴
	//스레드 기능을 구현하기 위한 메소드 재정의
		public void run() {
			//기능 구현
			
			for(int i = 1; i < 10; i++) {
				System.out.println(getName() + ": " + i
						+ " / 실제스레드: " + Thread.currentThread().getName());
			}		
		}
}

public class SimpleThread {
	public static void main(String[] args) {
		MyThread th = new MyThread();	//스레드 생성
		th.start(); // 스레드 시작 메소드 호출(스타트 내부에서 run이라는걸 참조해서 실행)
		//th.run(); 실행할때 무조건 스타트메소드사용 런은 순차적으로만 실행이 되기에 동시에 스레드가 되지않음
		
		MyThread th2 = new MyThread();
		th2.start();
	}
}
