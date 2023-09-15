package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.BranchElement;

import menu.Burger;

public class Main {

	public static void main(String[] args) {
		System.out.println("====맥날====");
		
		//메뉴 준비
		Burger b1 = new Burger("치즈버거",2800);
		Burger b2 = new Burger("빅맥",4800);
		Burger b3 = new Burger("상하이버거",4300);
		
		//메뉴 보여주기 
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
		
		//여러 객체 한번에 관리하기
//		Burger[] burgerArr = new Burger[3];
//		burgerArr[0] = b1;
//		burgerArr[1] = b2;
//		burgerArr[2] = b3;
		
		//여러 객체 한번에 관리하기(컬렉션)
		List<Burger> burgerList = new ArrayList<Burger>();
	
		burgerList.add(b1);
		burgerList.add(b2);
		burgerList.add(b3);
		
		//메뉴 보여주기
		for(Burger i : burgerList ) {
		System.out.println(i);
		}
	}

}
