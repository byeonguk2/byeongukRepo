package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main6 {

	public static void main(String[] args) {
		// 여러개의 객체를 관리할 컬렉션
		Map<String, User> user = new HashMap<String, User>();

		// 메뉴 객체 (데이터는 아무렇게나)여러개 만들고, 위에서 만든 컬렉션에 담기
		User m1 = new User("아이디1","비밀번호1");
		User m2 = new User("아이디2","비밀번호2");
		User m3 = new User("아이디3","비밀번호3");
		user.put(m1.getId(),m1);
		user.put(m2.getId(),m2);
		user.put(m3.getId(),m3);


		// 컬렉션의 들어있는 여러개의 객체 전부다 출력(모든 필드 값)
		System.out.println(user);
		
		Set<String> ks = user.keySet();
		
		for(String k : ks) {
			System.out.println(k);
			System.out.println(user.get(k));
		}
	
	

	}

}
