package main;

public class Main {

	public static void main(String[] args) { //메인 스레드가 메인 메소드를 실행한다.
		
		System.out.println("====쓰레드===="); 
		
		/*이 프로그램을 실행하게 되면 메인 쓰레드가 일을 시작한다
		메인 쓰레드는 main메소드 안에 있는 내용을 실행한다*/
		
		//현재 쓰레드 이름을 확인하는 코드
//		Thread x = Thread.currentThread();
//		System.out.println(x.getName());
		
		Thread x = new Thread(new KhClass());	
		x.start(); // 이 코드를 쓴다면 쓰레드가 시작한다
		//누구를 실행할까? 런이라는 메소드를 실행한다. 그러므로 런 메소드를 넣어준다
		Thread y = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("zzzzzzzzz");
				
			}
		}); 
		y.start();
		
//		Thread z = new Thread(() -> {System.out.println("3333");});
//		z.q(); /*@Functionalinterface 덕분에 가능하다 (스레드 파라미터 값은 무조건 Runnalble
//		이고 Runnalble가 인터페이스 때문이다. 인터페이스는 추상 메소드를 가지고 있다.)*/
	}

}
