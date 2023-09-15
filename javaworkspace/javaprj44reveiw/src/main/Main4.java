package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main4 {
	public static void main(String[] args) {
		
		//여러개의 객체를 관리할 컬렉션 
		 Stack<User> user = new Stack<User>();
		
		//메뉴 객체 (데이터는 아무렇게나)여러개 만들고, 위에서 만든 컬렉션에 담기
		 user.add(new User("dasd","sads"));
		 user.add(new User("adas","dada"));
		 user.add(new User("dada","ada"));
		
		//컬렉션의 들어있는 여러개의 객체 전부다 출력(모든 필드 값)
		System.out.println(user);
		
		for(User e : user) {
			System.out.println(e.getId());
			System.out.println(e.getPwd());
		}
		
	}
}
