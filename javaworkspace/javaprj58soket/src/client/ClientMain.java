package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {
	
	public static void main(String[] args) throws Exception {
		
		//스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====클라이언트 시작=====");

		//소켓 연결(발신)
		Socket soket = new Socket("192.168.40.60", 12345);//그냥 소켓은 처음에 발신을 하는 소켓
		
		//소켓 스트림 준비
		InputStream in = soket.getInputStream();
		OutputStream out = soket.getOutputStream();

		//스트림 준비 (발신)
		PrintStream ps = new PrintStream(out);
		
		//스트림 준비(수신)
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		//데이터 발신
		while(true) {
			System.out.print("보낼 메세지: ");
			String str = sc.nextLine();
			ps.println("송희님이 보낸 메세지:"+str);
			
			//데이터 수신
			String str2 = br.readLine();
			System.out.println(str2);
		}
	}

}
