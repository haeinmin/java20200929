package chap06.lecture.thisKeyword;

public class MyClass {
	
	int var;
	
	MyClass(int var) {
		
	}
	
	void method1() {
		int var = 5;
		System.out.println(this.var); //동명일 경우 필드 의미
		System.out.println(var); //코드 블럭 내 var 의미
	}
	
	void method2() {
		this.method1();
	}

}
