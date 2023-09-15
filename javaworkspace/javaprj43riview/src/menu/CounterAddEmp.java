package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CounterAddEmp {
	// 스캐너
	private final Scanner sc = new Scanner(System.in);

	public List<Menu> menulist = new ArrayList<Menu>();

	// 메뉴 보여주기
	public void showMenu() {
		// 메뉴판 준비

		menulist.add(new Menu("아메리카노", 2000));
		//menulist 컬렉션에 menu객체의 값을 넣어줌
		menulist.add(new Menu("카페라떼", 3900));

		menulist.add(new Menu("오렌지 에이드", 5000));

		menulist.add(new Menu("초코라떼", 4500));

		menulist.add(new Menu("밀크티", 4700));

		// 메뉴판의 모든 메뉴 출력
		for (Menu m : menulist) {
			System.out.println(m.getName()+"("+m.getPrice()+")");
		}

	}

	public void work() {
		// 메뉴 보여주기
		showMenu();

		// 메뉴 입력받기
		System.out.print("원하시는 메뉴 번호를 입력하세요: ");
		int menuNum = sacUserInput();
//		선택한 메뉴 확인시켜주고, 금액 더하고
		UserInput us = new UserInput();
		us.userInput(menuNum,menulist);
//		printMenu(menuNum);
//		갯수 입력받기
		System.out.print("수량을 입력하세요: ");
		int menuCnt = sacUserInput();
//		for(int i = 1; i < menulist.size(); i++) {
//			if(num == i) {
//				System.out.println("메뉴이름: "+menulist.get(i).getName());
//				System.out.println("메뉴가격: "+menulist.get(i).getPrice());
//				break;
//			 }
//		}
		 
		// 결제 (금액)
		int totalPrice = 0 ;
		int price = getMenuPrice(menuNum-1);
		totalPrice += price * menuCnt ;
		System.out.println("결제금액 :"+totalPrice+" 입니다");
	}

	private int getMenuPrice(int menuNum) {
		Menu result = (Menu)menulist.get(menuNum);
		return result.getPrice();
	}

	private void printMenu(int num) {
		Menu result = (Menu)menulist.get(num-1);
		System.out.println("메뉴이름: "+result.getName());
		System.out.println("메뉴가격: "+result.getPrice());
	}

	public int sacUserInput() {
		String numstr = sc.nextLine();
		int num = Integer.parseInt(numstr);
		return num;
	}

}
