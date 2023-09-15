//package test;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.Stack;
//
//import mob.Pokemon;
//
//public class Testclass {
//	
//	//List (인덱스로 요소들을 관리)(중복 o)
//	public void method01() {
//		System.out.println("=====List=====");
//		//List 구조: 그냥 배열이다.
//		//List 사용법
//		List a1 = new ArrayList();
//		
//		//넣기
////		Pokemon p = new Pokemon();
//		a1.add(p); //add(오브젝트) 그래서 우리는 모든 타입을 넣을수있다.
//		//꺼내기
//		Object result = a1.get(0);
//		
//		System.out.println(result);
//	}
//	
//	//Set (중복 x) 중복된 데이터들을 없앤다.
//	public void method02() {
//		System.out.println("====SET====");
//		
//		Set h1 = new HashSet();
//		
//		//넣기
//		h1.add(new Pokemon());
//		
//		//꺼내기
//		System.out.println(h1);
//		
//	}
//	
//	//Map (key - value 쌍으로 데이터를 관리) 자주 쓰임!!
//	//만약 key값이 중복된다면 실행안된다. key는 중복을 허용하지 않는다.
//	public void method03() {
//		System.out.println("====MAP====");
//		
//		Map m = new HashMap();
//		
//		//데이터 넣는건 put
//		m.put("first"/*키값*/, new Pokemon()/*입력값*/);
//		
//		//데이터 꺼내는건 키값
//		Object result = m.get("first");
//		System.out.println(result);
//		
//	}
//	
//	//Stack (LIFO<Last In First Out>마지막에 들어간게 먼저 나옴)
//	public void method04() {
//		System.out.println("====STACK====");
//		
//		Stack s = new Stack();
//		
//		//넣기
//		s.add(new Pokemon());
//		
//		//꺼내기
//		Object result = s.pop();
//		System.out.println(result);
//	}
//	
//	//Queue (FIFO<First In First Out>먼저 들어간게 먼저 나옴)
//	public void method05() {
//		System.out.println("====QUEUE====");
//		
//		LinkedList q = new LinkedList();
//		
//		//넣기
////		q.add(new Pokemon());
//		
//		//꺼내기
//		Object result = q.poll();
//		System.out.println(result);
//		
//	}
//}
