package main;

import java.util.ArrayList;
import java.util.List;

import emp.CounterEmp;
import menu.Burger;

public class Main {

	public static void main(String[] args) {
		System.out.println("====복습====");
		
		//버거 여러개 담을 컬렉션 준비
		List<Burger> burgerList = new ArrayList<Burger>();

		//버거 초기 셋팅 
		burgerList.add(new Burger("치즈버거",5000));
		burgerList.add(new Burger("빅맥버거",5500));
		burgerList.add(new Burger("소갈버거",6800));
		burgerList.add(new Burger("싸이버거",4600));
		burgerList.add(new Burger("치킨버거",3800));
		
		System.out.println("메인 메소드에서 버거 리스트 출력");
		System.out.println(burgerList);
		
		//카운터 직원을 통해서, 모든 버거 메뉴 출력
		CounterEmp cemp = new CounterEmp();
		cemp.showBurgerMenu(burgerList); //여기서 cemp객체의 주소에 burgerList의 주소값이 들어감
		//오늘 실험해보자.
		System.out.println("메인 메소드에서 버거 리스트 출력");
		System.out.println(burgerList);
		
		//모든 버거 메뉴를 출
//		for (Burger b : burgerList) {
//			System.out.println(b);
//		}
		
		
	}

}
