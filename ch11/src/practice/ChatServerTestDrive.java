package practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//접속하는 사람들을 클래스로 만들어줌
class User{
	private Socket socket;			// 서버에서 accept 이후 받은 socke을 저장
	private ObjectInputStream ois; 	// 클라이언트에서 전달한 메시지를 수신
	private ObjectOutputStream oos;	// 서버에서 여러 클라이언트로 메시지 송신
	//체인스트림만 있음

	public User(Socket s, ObjectInputStream ois, ObjectOutputStream oos) {
		this.socket = s;
		this.ois = ois;
		this.oos = oos;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public ObjectInputStream getOis() {
		return ois;
	}

	public void setOis(ObjectInputStream ois) {
		this.ois = ois;
	}

	public ObjectOutputStream getOos() {
		return oos;
	}

	public void setOos(ObjectOutputStream oos) {
		this.oos = oos;
	}

	public void close() throws IOException {
		ois.close();
		oos.close();
		socket.close();
	}
}

public class ChatServerTestDrive {
	public static final int PORT = 7070;
	private List<User> userList;

	public ChatServerTestDrive() {
		this.userList = new ArrayList<User>(); //유저를 담는 어레이 리스트
	}

	class ChatServerThread extends Thread{
		private ObjectInputStream ois;

		public ChatServerThread(ObjectInputStream ois) {
			this.ois = ois;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Object obj = ois.readObject();	// readLine과 동일
					if (obj instanceof String) { 
						String msg = (String) obj; //스트링타입으로 바꿔줌
						System.out.println(msg); // 실제 클라이언트 메시지가 어떤건지 확인해주기위해 출력함
						broadcast(msg); // 각 브로드캐스트마다 메세지를 보낼거임
						
						if (msg.equals("quit")) {
							System.exit(0);
						}
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// 누군가 사용자 한명이 퇴실하면 IOException이 발생
					removeClient(ois);	// 중간에 누군가 빠져나오면 io 예외가 발생
				}
			}
		}
	}

	//접속한 각 클라이언트마다 특정 사용자의 메시지를 전달
	private void broadcast(String msg) {
		for (int i = 0; i < userList.size(); i++) {
			try {
				userList.get(i).getOos().writeObject(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 사용자 퇴실처리
	public void removeClient(ObjectInputStream ois) {
		// 사용자 목록 전체를 검색해서 인자로 받은 ois와 같은 사용자가 있는지 검사
		for (User user : userList) {
			ObjectInputStream in = user.getOis();
			if (in.equals(ois)) {
				try {
					user.getOis().close();
					user.getOos().close();
					user.getSocket().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				userList.remove(user);
				broadcast("사용자가 나갔습니다");
				System.out.println("사용자가 나갔습니다.");
				break;
			}
		}
	}

	// 프로그램 처음 실행 시 호출
	public void go() {
		try {
			// 1. ServerSocket 생성
			ServerSocket serverSocket = new ServerSocket(PORT);
			while (true) {
				//2. 접속한 클라이언트의 socket 객체를 받음
				System.out.println("클라이언트 접속 대기중 ...");
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트 접속 완료 ...");

				//3. 소켓에서 Connection Stream 가져오기
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();

				//4. Connection Stream을 Chain Stream에 연결
				ObjectInputStream ois = new ObjectInputStream(in);
				ObjectOutputStream oos = new ObjectOutputStream(out);

				//5. 유저 객체를 생성
				User user = new User(socket, ois, oos);

				//6. User 목록에 추가
				userList.add(user);
				System.out.println("사용자 추가완료 ...");

				//7. 추가한 사용자의 메시지를 계속 보ㅣ기위해 Thread 생성
				new ChatServerThread(ois).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatServerTestDrive().go();
	}
}
