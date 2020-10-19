package chap08.textbook.s080701;

public interface MyInterface {
	public void method1();
	public default void method2() { //default keyword를 통해 몸통 있는 method 만들 수 있게 됨
		System.out.println("MyInterface-method2");
	}
}
