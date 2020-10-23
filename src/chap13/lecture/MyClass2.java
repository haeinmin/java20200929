package chap13.lecture;

public class MyClass2 <T extends Number> { //number class로 제한
	//number 포함 하위class만 가능
	//number가 갖고 있는 method 안전하게 실행 가능
	
	void method1 (T t) {
		System.out.println(t.doubleValue());
	}

}
