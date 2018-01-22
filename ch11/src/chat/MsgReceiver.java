package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class MsgReceiver extends Thread{
	String nickname;
	Socket socket;
	BufferedReader in;

	public MsgReceiver(String nickname, Socket socket) {
		this.nickname = "[" + nickname + "] ";
		this.socket = socket;
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	public void run() {
		while (in != null) {
			try {
				String msg = in.readLine();
				System.out.println(msg);
				if (msg == null || msg.equals("quit")) { //메세지가 널이거나 큇일경우
					in.close();
					in = null;
					System.exit(0);
				}
			} 	catch (SocketException e) {
				System.exit(0);
			}
				catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}

}
