package interfacsu;

interface BB {	// 인터페이스
	
	abstract void test3();	// 추상 메서드
	abstract void test4();
}

interface CC { //인터페이스
	
	void test5(); // 인터페이스에서 abstract 키워드를 생략할 수 있다.
	void test6();
	
}

class DD implements BB , CC { // 인터페이스는 다중 구현이 가능하다.
//DD라는 클래스에 인터페이스를 다중구현함
	@Override
	public void test3() {
		System.out.println("테");
	}

	@Override
	public void test4() {
		System.out.println("스");
	}

	@Override
	public void test5() {
		System.out.println("트");
	}

	@Override
	public void test6() {
		System.out.println("1");
	}
	
}
 
public class OOPEx06 {

	public static void main(String[] args) {
		DD test = new DD();
		test.test3();
		test.test4();
		test.test5();
		test.test6();
	}
	
}