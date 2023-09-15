package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import data.Member;

public class MemberManager {
	private Scanner sc = new Scanner(System.in);
	private Map<String,Member>memberMap = new HashMap<String,Member>();
	
	// 메뉴 보여주기
	public void showMenu() {
		System.out.println("\n원하시는 메뉴 번호를 입력하세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("===========================");
	}
	// 입력받기
	public String scanUserString() {
		return sc.nextLine();
	}

	// 회원가입
	public void join() {
		System.out.println("=====회원가입=====");
		System.out.print("아이디: ");
		String id = scanUserString();
		System.out.print("비밀번호: ");
		String pwd = scanUserString();
		System.out.print("닉네임: ");
		
		String nick = scanUserString();
		
		Member m = new Member(id,pwd,nick);
		
		//값 검증
		try {
		checkBalidation(m);
		}catch (Exception e) {
			System.out.println("아이디가 이상함");
		}
		//멤버 객체 저장
		memberMap.put(m.getId(),m);
		
		System.out.println(m.getNick()+"님 회원가입이 완료되었습니다.");
	}
	
	//값 검증
	private void checkBalidation(Member m)throws Exception {
			//아이디 검사
			checkId(m.getId());

		
		
	}
	private void checkId(String id)throws Exception {
		if(id.length() < 4) {
			throw new Exception();
		}
		
	}
	// 로그인
	public void login() {
		try {
		System.out.println("=====로그인=====");
		System.out.print("\n아이디를 입력하세요: ");
		String id = scanUserString();
		System.out.print("비밀번호를 입력하세요: ");
		String pwd = scanUserString();
		Member x = memberMap.get(id);
		boolean result = id.equals(x.getId())&&pwd.equals(x.getPwd());
		if(result) {
			System.out.println("\n로그인성공");
		}else {
			System.out.println("\n비번틀림");
		}
		}catch (Exception a) {
			System.out.println("\n아이디 다름");
		}
		
	}
	public void startWork() {
		showMenu();
		String input = scanUserString();
		switch(input) {
		case "1" : join(); break; 
		case "2" : login(); break;
		default : System.out.println("잘못고름");
		}
	}
}
