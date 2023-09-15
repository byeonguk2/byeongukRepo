package interfacsu;

class Point { //슈퍼클래스
	
	int x;
	int y;
	void move() {}
} //포인트 클래스에는 필드 x y , 멤버 메소드 move가 존재한다

interface Draw { //인터페이스
	
	abstract void draw(); //추상메소드 draw 선언
	abstract void erase();	//추상메소드 erase 선언
}

interface Graphic { //인터페이스
	
	abstract void resize(); //추상 메소드 resize선언
	abstract void rotate(); //추상 메소드 rotate선언
}

// 클래스 상속과 인터페이스를 동시에 구현한 예시
class Line extends Point implements Graphic,Draw { //자식 클래스
//Line 클래스에 포인트 클래스를 상속하고 인테페이스 2개를 구현했다.
	
	public Line() {
		super.x=100;
		super.y=50;
	}
	
	@Override
	void move() {
		System.out.println(x+y);
	}

	@Override
	public void draw() { //인터페이스에서 받아온 추상 메소드
		System.out.println("t");
	}

	@Override
	public void erase() { //인터페이스에서 받아온 추상 메소드
		System.out.println("e");
	}

	@Override
	public void resize() { //인터페이스에서 받아온 추상 메소드
		System.out.println("s");
	}

	@Override
	public void rotate() { //인터페이스에서 받아온 추상 메소드
		System.out.println("t");
	}
//Line 클래스에는 Point클래스에 필드 메소드가 존재할것이다.
	
}

public class OOPEx08{ 

	public static void main(String[] args) {
		Line line = new Line();	
		line.move();
		line.draw();
		line.erase();
		line.resize();
		line.rotate();
		
	}

}