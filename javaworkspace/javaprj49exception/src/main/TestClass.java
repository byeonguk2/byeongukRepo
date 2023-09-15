package main;

public class TestClass  {
	public void method01 () throws  Exception {
		System.out.println("method 01 start~!");
		method02();
		System.out.println("method 01 end");
	}
	public void method02() throws  Exception {
		System.out.println("method 02 start~!");
		try {
			System.out.println(11111);
			int[] arr = new int[3];
			arr[7] = 10;
//			int x = 3/0 ; //예외가 발생하도록 유도
			System.out.println(22222);
			throw new Exception(); //강제로 에외 발생
//			System.out.println(22222); //위에서 던지는데 아래에 코드가 있으니 오류가 생김
		}catch(Exception e) { //잡으려고 하는 예외종류
			System.out.println("0으로 나누려는거 잡았다 ㅋㅋㅋ잡았다 ㅋㅋ");//예외를 잡아서 처리할 내용,,,,,
//		}catch(ArrayIndexOutOfBoundsException y) {
//			System.out.println("인덱스 범위 잘못쓴거 잡았다 ㅋㅋ");
//		}
		}
		method03();
		System.out.println("method 02 end");
	}
	public void method03() {
		System.out.println("method 03 start~!");
		System.out.println("method 03 end");
	}

}
