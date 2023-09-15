package main;

public class Main {

	public static void main(String[] args) { //메인 쓰레드가 위 부터 하나씩 실행 할것이다.
//		System.out.println("====쓰레드====");
//		
//	    Thread t = new Thread(() -> {
//	    	Thread x = Thread.currentThread();  // 현재 쓰레드에 정보 얻어옴
//			String y = x.getName();
//			System.out.println(y + "Run 메소드 생성됨");;}); //이게 왜 작동할까?
//	    t.start();
//	    
//		Thread t0 = Thread.currentThread(); /* 메인 스레드가 이 메소드를 실행할것이다. 들어가니
//		자기 정보를 리턴을 하라고 코드가 짜여있어 그 정보가 t0이라는 변수에 담긴다.*/
//		//class파일에.찍어서 메소드를 불러오는거 currentThredd는 스태틱 메소드 일것이다. 
//		
//		String t0Name = t0.getName();
//		System.out.println(t0Name);
//		
//		//쓰레드 객체 생성 
//		Thread t1 = new Thread(new KhClass()); //KhClass에는 다형성이 적용되어 안에 메소드도 전달할 수 있다.
//		t1.getName();
//		t1.getId();
//		System.out.println(t1.getId());
//		t1.start();  //스레드를 만들고 런까지 시켜주는 작업
//		//런인 경우 메인스레드가 그냥 이 객체를 실행하는 것 뿐이다
//		Thread t2 = new Thread(new KhClass());
//		t2	.start();
		
	}

}
