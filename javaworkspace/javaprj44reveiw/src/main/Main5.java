package main;

import java.util.LinkedList;
import java.util.Queue;

public class Main5 {

	public static void main(String[] args) {
		//여러개의 객체를 관리할 컬렉션 
		Queue user = new LinkedList();
		
		// 메뉴 객체 (데이터는 아무렇게나)여러개 만들고, 위에서 만든 컬렉션에 담기
		user.add(new User("dasd","dada"));
		user.add(new User("dasdad","dasd"));
		user.add(new User("fsdg","gfg"));
		user.add(new User("gdfgh","fafs"));
		
		// 컬렉션의 들어있는 여러개의 객체 전부다 출력(모든 필드 값)
		System.out.println(user);
		
	}

}
