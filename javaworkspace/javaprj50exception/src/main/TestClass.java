package main;

public class TestClass {
	
	public void method01() throws Exception {
		System.out.println("method01 start");
//		try {
			method02();
//		} catch (Exception e) {
//			System.out.println("메소드 01 잡았음");
//		}
		System.out.println("method01 end");
	}
	public void method02() throws Exception { //에외가 발생할수도 있는 메소드
		System.out.println("method02 start");
		int x =3 / 0;
		method03();
		System.out.println("method02 end");
	}
	public void method03() {
		System.out.println("method03 start");
		System.out.println("method03 end");
	}
}
