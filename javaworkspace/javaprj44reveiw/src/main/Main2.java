package main;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {

		// 여러개의 객체를 관리할 컬렉션
		List<User> user = new ArrayList<User>();

		// 메뉴 객체 (데이터는 아무렇게나)여러개 만들고, 위에서 만든 컬렉션에 담기
		user.add(new User("quddnr", "1234"));
		user.add(new User("qudcks", "5678"));
		user.add(new User("ekenddl", "1029"));

		// 컬렉션의 들어있는 여러개의 객체 전부다 출력(모든 필드 값)
		System.out.println(user); // 리스트 타입의 객체를 출력하면 안에 값이 모두 toString으로 출력됨.

		// 여러개의 객체 전부다 출력
//		for (int i = 0; i < user.size(); i++) {
//			User e01 = user.get(i);
//			System.out.println(e01.getId());
//			System.out.println(e01.getPwd());
//		}
		for(User e : user){
			System.out.println(e.getId());
			System.out.println(e.getPwd());
		}

		// 여러개의 객체 전부다 출력

	}

}
