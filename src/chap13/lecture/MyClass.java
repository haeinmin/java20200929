package chap13.lecture;

public class MyClass<T> { //T에는 class, enum 등 참조타입 넣을 수 있음 //Type Parameter
	public void method1() {
		System.out.println("메소드1");
	}
	
	public void method2(T s) {
		System.out.println(s);
	}
}
