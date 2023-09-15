package serverMain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) throws Exception {
		System.out.println("=====서버 프로그램=====");

		// 서버 소켓 생성(연결 받을 수 있음)
		ServerSocket serverSocket = new ServerSocket(12345); // 얘는 에외처리가 필수이다.
		// sever socket을 통해 연결되기 즉 수신대기가 가능해진다.
		// 서버 소켓은 수신 전용이다.
		// 연결 대기하기
		System.out.println("연결 대기중...");
		Socket socket = serverSocket.accept();
		InetAddress inetAddr = socket.getInetAddress();
		System.out.println(inetAddr + "연결됨");
		/*
		 * 스캐너로 입력받을때 깜빡거리면서 입력 대기하는것처럼 연결 대기를 하는것이고
		 */

		// 소켓 스트림 준비
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();

		// 스트림 준비(수신)
		InputStreamReader isr = new InputStreamReader(in);

		// 글자읽어오고 받아오기
		BufferedReader br = new BufferedReader(isr);

		// =============================================================================

		 //데이터 보내기
		Scanner sc = new Scanner(System.in);

		// 스트림 준비 (발신)
		PrintStream ps = new PrintStream(out);

		while (true) {
			String str = br.readLine();

			System.out.println(str);

			// 데이터 보내기
			System.out.print("보낸 메세지: ");
			String str2 = sc.nextLine();
			ps.println("병욱 어드민이 보낸 메세지:" + str2);
		}

	}

}
