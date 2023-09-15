package main;

import member.controller.MemberManager;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("\n===== 회원 관리 프로그램 =====");
		// 회원가입
		boolean isFinish = true;
		MemberManager mm = new MemberManager();
		while (isFinish) {
			try {
				isFinish =mm.showMenu();
			} catch (Exception e) {
				String errorMsg = e.getMessage();
				System.err.println(errorMsg);
			}
		} 
		System.out.println("\n=====프로그램 종료======");
	}

}
