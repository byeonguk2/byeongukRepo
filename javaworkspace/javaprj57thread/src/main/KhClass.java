package main;

public class KhClass implements Runnable {

	@Override
	public void run() {
		Thread x = Thread.currentThread();  // 현재 쓰레드에 정보 얻어옴
		String y = x.getName();
		System.out.println(y + "Run 메소드 생성됨");
		
	}

}
