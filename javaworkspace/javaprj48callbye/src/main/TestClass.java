package main;

public class TestClass {
	
	public void method01() {
		System.out.println("m01 called...");
		Person p = new Person();
		method02(p);
		System.out.println(p.age);
	}
	
	public void method02(Person p) {
		System.out.println("m02 called...");
		p.age += 10;
	}
}
