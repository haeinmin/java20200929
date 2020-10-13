package chap06.lecture.method.overloading;

public class MyClass {
	void method1() {
		System.out.println("method1.........");
	}
	
	void method1(int i) {
		System.out.println("method1#######"); //동명의 method라면 parameter의 type이 달라야 함 compile error
	}
	
	void method1(double j) {
		System.out.println("method1********");
	}
	
	void method1(int i, int j) { //parameter의 개수가 달라도 됨
		System.out.println("method1 int, int");
	}
	
	void method(int i, double j) {
		System.out.println("method1 int, double");
	}
	
	void method1(double i, int j) {
		System.out.println("method1 double, int");
	}
	
	int method1(double i, int j) { //return 타입이 다르다고 가능한 것은 아님
		System.out.println(method1 double, int, return int);
		return 3;
	}

}

// overloading이란 method의 이름이 같아도 parameter를 다르게 하여 유효하게 하는 것
