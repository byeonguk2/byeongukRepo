package main;

public class TestClass {

	public void method01() {
		System.out.println("method01 start");
		method02();
		System.out.println("method01 end");
	}

	public void method02() {
		System.out.println("method02 start");
		try {
//		throw new Exception("zzz");
		throw new KhException("이거 throw 처리해서 그래");
		}catch(Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}
		method03();
		System.out.println("method02 end");
	}
	
	public void method_02() {
		System.out.println("method02 start");
		try {
			System.out.println("111111");
			int a = 3 / 1;
			System.out.println("222222");
		} catch (Exception e) {
			System.out.println("여기서 문제 생김");
			
//			System.out.println(e);
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		}finally {
			System.out.println("파이널리 블록");
		}
		method03();
		System.out.println("method02 end");
	}

	public void method03() {
		System.out.println("method03 start");
		System.out.println("method03 end");
	}

}
