package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	private List<Menu> menu = new ArrayList<Menu>();

	// 일 시작
	public void startWork() {
		// 메뉴판준비
		prepareMenu();

		// 메뉴판 보여주기
		showMenu();

		// 주문 결제받기
		pay();

	}

	private void prepareMenu() {
		menu.add(new Menu("김밥", 2500));
		menu.add(new Menu("라면", 3500));
		menu.add(new Menu("돈까스", 6000));
	}

	private void showMenu() {
		for (Menu m : menu) {
			System.out.println(m.getName() + "(" + m.getPrice() + ")");
		}
	}

	private String order2() {
		line();
		System.out.print("\n원하시는 메뉴를 입력하세요: ");
		return userInput();
	}

	private int order() {
		System.out.print("\n주문하실 수량을 적어주세요: ");
		String x = userInput();
		return Integer.parseInt(x);
	}

	Menu user;
	private String pay() {
		String scanMenu = order2();
		for (Menu userMenu : menu) {
			if (userMenu.getName().equals(scanMenu)) {
				user = userMenu;
				break;
			}else {
				System.out.println("\n존재하지 않는 메뉴입니다");
				return pay();
			}
		}
		int cnt = order();
		if(cnt<=0) {
			System.out.println("\n수량을 1개 이상부터 입력해주세요.");
			return pay();
		}else if(cnt>0) {
			System.out.println("결제금액은"+user.getPrice()*cnt);
		}
		return "";
	}

	private String userInput() {
		return sc.nextLine();
	}

	private void line() {
		System.out.println("\n==============================");
	}

}
