package Thread;

public class ThreadState implements Runnable{
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(400);	// 400초동안 돈다는것
				// 현재 스레드의 상태를 출력
				System.out.print(Thread.currentThread().getState() + ", ");
				
				// 현재 스레드의 이름을 출력
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
			catch(InterruptedException e) {
				System.out.println("InterruptedException이 발생되어 스레드를 종료합니다");
				return;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("스레드의 모든 상태: 6가지");
		
		// Thread.State enum에 정의된 값들을 하나씩 출력해본 것
		for (Thread.State c : Thread.State.values())
			System.out.print(c + " ");
		System.out.println('\n');
	
		Thread th = new Thread(new ThreadState());
		System.out.println("기본 우선순위: " + th.getPriority()); // 모든 Priority는 기본으로 5값이 세팅되있음
		//우선순위 지정
		th.setPriority(Thread.NORM_PRIORITY + 2); // 우선순위변경은 1부터 10까지 지정할수있음(현재는 7)
		System.out.println("우선순위 변경: " + th.getPriority());
		
		System.out.println("1당계: " + th.getState());
		th.start();
		
		System.out.println("2단계: " + th.getState()); //RUNNABLE은 시작이 됬다는것
		
		Thread.sleep(2000); //main 스레드에서 실행 -> main 스레드가 2초 멈춤
		
	
		th.interrupt(); //인터룹트는 2(2000밀리초)초뒤에 실행됨, 인터룹트는 터미네잇(끝내는거)
		System.out.println("3단계: " + th.getState());
		
		Thread.sleep(1000);
		
		System.out.println("4단계: " + th.getState());
	}
}
