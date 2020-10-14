package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2; //instance(object)과 class 둘 다 모두 기능 실행 가능
	int var1;
	
	static { //static 초기화를 위한 block
		System.out.println("static block");
		var2 = 3000;
	}
	
	void method1() {
		System.out.println(var1); //instance member는 class member 접근 가능
	}
	
	static void method2() {
		// method1();
		// System.out.println(var1); // 오류 발생. 어느 var1인지 모르니까
										//class member는 instance member 접근 불가
		System.out.println(var2);
	}

}
