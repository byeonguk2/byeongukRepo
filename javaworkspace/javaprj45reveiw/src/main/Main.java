package main;

import java.util.ArrayList;
import java.util.List;

import menu.Burger;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====맥날====");
		
		Burger burger = new Burger("치즈버거",2800);
		
		String b =burger.getName();
		System.out.println(b);
		
		int b2 = burger.getPrice();
		System.out.println(b2);
		
		System.out.println(burger);
		
		List b1 = new ArrayList();
		b1.add(new Burger("치즈버거",2300));
		b1.add(new Burger("상하이 치킨버거",4800));
		b1.add(new Burger("불고기버거",2800));
		b1.add(new Burger("빅맥",4300));
	
	}

}
