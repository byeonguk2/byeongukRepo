package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("복습");
		//메뉴 객체 여러개 만들기
		List<Menu> menuList = new ArrayList<Menu>();
		menuList.add(new Menu("아메리카노",5000));		
		menuList.add(new Menu("카페라떼",5500));		
		menuList.add(new Menu("청포도에이드",5000));		
		menuList.add(new Menu("레몬에이드",5800));		
		menuList.add(new Menu("콜드브루",5000));		
		//여러개의 객체를 관리할 변수
		System.out.println(menuList.get(0));
		System.out.println(menuList.get(1));
		System.out.println(menuList.get(2));
		System.out.println(menuList.get(3));
		System.out.println(menuList.get(4));
		//여러개의 객체 전부다 출력(모든 필드 값)
		
		//여러개의 객체 전부다 출력(객체 의 name 필드만 출력)
		System.out.println(menuList.get(0).getName());
		System.out.println(menuList.get(1).getName());
		System.out.println(menuList.get(2).getName());
		System.out.println(menuList.get(3).getName());
		System.out.println(menuList.get(4).getName());
		//여러개의 객체 전부다 출력(객체 의 price 필드만 출력)
		System.out.println(menuList.get(0).getPrice());
		System.out.println(menuList.get(1).getPrice());
		System.out.println(menuList.get(2).getPrice());
		System.out.println(menuList.get(3).getPrice());
		System.out.println(menuList.get(4).getPrice());
	}
	
	
}
