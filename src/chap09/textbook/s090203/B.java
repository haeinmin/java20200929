package chap09.textbook.s090203;

public class B {
	public static void main(String[] args) {
		A a = new A();
		
		//instance member class 객체 생성
		A.B b = a.new B(); // instance 생성
		b.field1 = 3;
		b.method1();
		
		//static mamber class 객체 생성
		A.C c = new A.C(); //바깥 클래스에서 바로 접근 가능
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//local class 객체 생성을 위한 메소드 호출
		a.method();
	}

}
