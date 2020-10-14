package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2; //instance(object)과 class 둘 다 모두 기능 실행 가능
	int var1;
	
	void method1() {
		System.out.println(var1);
	}
	
	static void method2() {
		System.out.println(var2);
	}

}
