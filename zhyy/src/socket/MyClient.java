package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	private static Socket client;
	public static void main(String[] args) throws UnknownHostException, IOException {
		client = new Socket("172.21.1.65", 8081);
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8"),true);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
		while(true) {
			String str = reader.readLine();
			writer.println(str);
		}
		
	}
	
}
