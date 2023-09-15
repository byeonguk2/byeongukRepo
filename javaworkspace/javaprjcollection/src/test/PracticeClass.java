package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

import mob.Pokemon;

public class PracticeClass {
	
	//List
	public void methtod01() {
		System.out.println("====List====");
	    List a1 = new ArrayList();
		
		int num = 10;
		String str = "Hello";
		
		a1.add(new Pokemon("피카츄","백만볼트").skill);
		a1.add(num);
		a1.add(str);
		
//		for(int i = 0; i < 3; i++) {
//			System.out.println(a1.get(i));
//		}
		
		System.out.println(a1);
		
//		a1.add(0, "박병욱")
//		a1.add(4, "박병욱")
//		a1.add(5, "박병욱");
//		a1.clear();
		
		System.out.println(a1);
		
//		System.out.println(a1.contains(a1));
		
		System.out.println(a1.get(0));
		
	}

	HashSet s = new HashSet();
	//Set //set이나 map은 순서가 상관없을때 쓰는 컬렉션이다.
	public void methtod02() {
		System.out.println("====SET====");
		//set은 중복이 안됀다.
	
		
		s.add("one"); // add로 값을 넣을수 있고
		s.add("one"); // 꺼내오는게 불가능 전체가 알아서 출력 index가 없다.
		s.add("one");
		s.add("two");
		HashSet s = new HashSet();
		s.add(new Pokemon("피카", "박치기"));
		System.out.println(s);
		s.add(2);
		s.add(23);
		
		System.out.println();
		
		System.out.println(s);
		
	}
	
	//Map
	Map map = new HashMap(); //다형성을 이용해서 상위타입으로 타입을 잡자.(상위로 잡으면 하위타입을 다 +
	//쓸수있으니)
	public void methtod03() {
		System.out.println("====MAP====");

		
		
		map.put("name","qds"); //맵에 put으로 입력가능
		map.put("name","박투욱"); //같은 키값에 출력값을 다르게 넣는다면?
		//마지막으로 벨류값으로 출력이 된다 // 즉 벨류값이 변경된걸로 확인이된다.
		map.put("pby",77);
		map.put("quddnr","M");
		map.put(1,"일");
		map.put(2,"이");
		map.put(3,"삼");
		
		Object result = map.get("name"); // object대신에 string을 쓴다면 오류가 생긴다
		Object resultq = map.get("name"); // object대신에 string을 쓴다면 오류가 생긴다
		//map에서 무슨 타입이 나올지 모르니 object타입을 쓴다면 모든 타입을 쓸수있으니 오류가 안생긴다
		//결론은 저런 상황이라면 무조건 초조상 클래스 초상위 클래스를 쓰자
		System.out.println(result);
		System.out.println(resultq);
		Object result2 = map.get("pby");
		System.out.println(result2);
		Object result3 = map.get("quddnr");
		System.out.println(result3);
		Object result4 = map.get(1);
		System.out.println(result4);
		Object result5 = map.get(2);
		System.out.println(result5);
		Object result6 = map.get(3);
		System.out.println(result6);
		
		System.out.println(map);
		
		boolean x =map.isEmpty(); // map에 키값이 없다면 true가 나오게 함
		//map에는 순서에 개념이 없다
		System.out.println(x);
		System.out.println(map);
		
		Object resultn = map.remove("name"); //키값을 쓰면 그 키값에 벨류값을 초기화한다
		System.out.println(resultn);
		
		map.clear(); //클리어는 말 그대로 다 없앰
		System.out.println(map);
		
	}
	
	//Stack //중복가능 // 첫번째부터 출력
	public void methtod04() { 
		System.out.println("====STACK====");
		
		Stack stack = new Stack();
		
		stack.add("one");
		stack.add("one2");
		stack.add("one3");
		
		Object result3 = stack.peek(); //peek 마지막 요소만 출력하지만 stack안에는 없애지 않는다  
		System.out.println(result3);
		
		Object result4 = stack.peek(); //peek 마지막 요소만 출력하지만 stack안에는 없애지 않는다  
		System.out.println(result4); 
		
		System.out.println(stack); //스택안에는 똑같을것이다
		
		Object result = stack.pop(); //pop 마지막 요소만 꺼낸다  
		System.out.println(result);
		
		Object result2 = stack.pop(); //pop 마지막 요소만 꺼낸다  
		System.out.println(result2); 
		
		System.out.println(stack); //스택은 이제 one만 있을거다
	
	}
	
	//Queue //Queue는 객체 생성불가 이유는 인터페이스 이기 때문에;
	//Queue를 쓰기 위해서는 자식클래스를 가져오는것이다 (LinkedList)
	public void methtod05() {
		Queue queue = new LinkedList();
		queue.add("하이");
		queue.add("잘가");
		queue.add("빠이");
		
		Object result2 = queue.peek(); //첫번째 요소를 꺼내지만 queue안에 내용이 사라지지는 않는다.
        System.out.println(result2); 
        System.out.println(queue);
		
		Object result = queue.poll(); //첫번째 요소를 꺼내고 그 요소는 queue에서 사라짐.
		System.out.println(result);
        System.out.println(queue);
        
        Object result3 = queue.peek(); //첫번째 요소를 꺼내지만 queue안에 내용이 사라지지는 않는다.
        System.out.println(result3); 
        System.out.println(queue);
	}
}
