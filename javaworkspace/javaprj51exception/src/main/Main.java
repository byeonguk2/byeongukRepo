package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("=====예외처리=====");

//		TestClass testClass = new TestClass();
//		
//		testClass.method01();

		// 위 아래 같은 내용이다. 짧은 문장을 가져올때 좋다
		// 그러나 위에 객체는 계속 사용가능하고 아래 객체는 일회용이다.

		new TestClass().method01();
	}

}
