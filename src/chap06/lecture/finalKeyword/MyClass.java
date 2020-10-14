package chap06.lecture.finalKeyword;

public class MyClass {
	int field1;
	final int field2;
	
	final static int field3 = 20;
	final static int field4;
	
	static {
		field4 = 30;
	}
	
	public MyClass() {
		field2 = 99; //final field는 생성자에 의해 값을 꼭 할당해주어야 하며 이후 값이 변하지 않아 상수와 같음.
	}

}

// final은 값이 변하지 않으므로 상수처럼 사용.
// 상수는 대문자로 작성하는 것이 관습.
// ex. integer의 MIN_VALUE, MAX_VALUE
