package member.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.annotation.processing.Filer;

public class MemberManager {
//	private FileReader fr; 
	private File f;
	private PrintWriter pw;
	private Scanner sc;
	private BufferedReader br; // 문자를 받아오는거  
	// FileReader는 파일을 읽는다 말그대로 

	public MemberManager() throws Exception {
		sc = new Scanner(System.in);
		String x = File.separator;
		f = new File("D:" + x + "byeonguk2" + x + "data.txt");
//		br = new BufferedReader(new FileReader(f));
		pw = new PrintWriter(new FileWriter(f, true), true);
	}

	// 메뉴
	public boolean showMenu() throws Exception {
		System.out.println("\n=====메뉴=====");
		System.out.println("\n1. 회원가입\n\n2. 로그인\n\n3. 전체 회원 조회\n\n4. 종료");
		System.out.print("\n원하시는 메뉴 번호를 입력하세요: ");
		String num = scanUserInput();
		boolean isFinish = true;

		switch (num) {
		case "1":
			join();
			break;
		case "2":
			login();
			break; // 예외처리
		case "3":
			selectAllUser();
			break;
		case "4":
			isFinish = false;
		default:
		}
		return isFinish;
	}

	// 회원가입
	private void join() throws Exception {
		// 유저에게 데이터(아이디 비번 닉네임) 입력받기
		System.out.println("\n=====회원가입=====");
		System.out.print("\n아이디: ");
		String id = scanUserInput();

		System.out.print("\n비밀번호: ");
		String pwd = scanUserInput();

		System.out.print("\n닉네임: ");
		String nick = scanUserInput();
		
		//데이터 검사
		boolean isError = id.contains("#");
		if(isError) {
			throw new Exception("\n아이디에 부적절한 글자가 있습니다.");	
		}
		if(id.length()<4) {
			throw new Exception("\n4글자 이상으로 아이디 생성하세요.");
		}
		

		// 입력받은걸로 파일에 저장
		pw.println(id + "#" + pwd + "#" + nick);

		System.out.println("\n===== 회원가입 완료=====");

	} // join end

	// 로그인
	private void login() throws Exception {
		br = new BufferedReader(new FileReader(f));
		System.out.println("\n=====로그인=====");
		// 유저한테 데이터(아이디,비번) 입력받기
		System.out.print("\n아이디: ");
		String id = scanUserInput();

		System.out.print("\n비밀번호: ");
		String pwd = scanUserInput();
		
		boolean isOk = false;
		while (true) {
			// 파일에서 회원정보 조회하고
			String str = br.readLine(); //br.readLine은 통로를 이용해서 한줄을 읽어온다.
			if(str == null) {
				break;
			}

			// 회원정보에서 id,pwd 만 꺼내기
			int idx = str.indexOf("#");
			String momoid = str.substring(0, idx); // ()안에는 인덱스 //특정 문자열을 잘라오는 기능
			int idx2 = str.lastIndexOf("#");
			String momopwd = str.substring(idx + 1, idx2);
			
			// 일치하는지 확인
			isOk = id.equals(momoid) && pwd.equals(momopwd);
			if(isOk) {
				break;
			}
		}// while end

		if (isOk) {
			System.out.println("\n로그인 성공");
			// 할일 닉네임님 환영합니다.
		} else {
			System.out.println("\n로그인실패");
		}

	} // login end

	// 모든회원 정보조회
	private void selectAllUser() throws Exception {
		br = new BufferedReader(new FileReader(f));
		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(str);
		}
	} // selectAllUser end

	private String scanUserInput() {
		return sc.nextLine();
	}
} // class
