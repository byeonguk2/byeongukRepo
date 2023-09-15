package main;

import java.util.HashSet;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		
		//여러개의 객체를 관리할 컬렉션
		Set<User> user = new HashSet<User>();
		
		//메뉴 객체 (데이터는 아무렇게나)여러개 만들고, 위에서 만든 컬렉션에 담기
		user.add(new User("das","564"));
		user.add(new User("ada","546"));
		user.add(new User("asda","4564"));
		
		//컬렉션의 들어있는 여러개의 객체 전부다 출력(모든 필드 값)
		System.out.println(user);
		
		//여러개의 객체 전부다 출력
		for(User e : user) {
			System.out.println(e.getId());
			System.out.println(e.getPwd());
		}
		//여러개의 객체 전부다 출력

	}

}
