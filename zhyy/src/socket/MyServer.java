package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	private static ServerSocket server;
	
	public static void main(String[] args) throws IOException {
		server = new ServerSocket(8081);
		while(true) {
			Socket accept = server.accept();
			System.out.println("新的客户端加入：" + accept.getPort());
			BufferedReader reader = new BufferedReader(new InputStreamReader(accept.getInputStream(), "UTF-8"));
			while(true) {
				String readLine = reader.readLine();
				System.out.println(accept.getPort() + "：" + readLine);
			}
		}
	}
	
}
