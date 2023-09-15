package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====예외처리====");
		
		 TestClass tc = new TestClass();
		 try {
		 tc.method01();
//		 tc.method02();
//		 tc.method03();
		 }catch (Exception e) {
			 System.out.println("잡았다");
		 }
	}

}
