package javaprjreveiwr;

public class dasa {

	public static void main(String[] args) {
		String a = "희성"; //123
		String b = "범렬"; // 123
		
		// 한번 참조하면 값이 변할수없다
		//  메모리안에 스트링풀라는 장소가 있다.
		System.out.println(a==b); // true;
		
		a = b; //123 
		
		b = "병욱";  // "234" 
		
		System.out.println(b); // 희성 
		
		String c = new String("희성");
		String d = new String("희성");
		
		System.out.println(c==d); // false
		
		
	
		Test a2 = new Test();
		
		a1.name ="희성";
		a2.name ="병욱";
		
		a1.name = "송희";
		
		System.out.println(a1);
		
			
		

	}
	
public	class Test{
		String name;
		int num;
	}

}
