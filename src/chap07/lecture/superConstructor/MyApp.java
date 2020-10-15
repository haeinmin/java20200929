package chap07.lecture.superConstructor;

public class MyApp {
	public static void main(String[] args) {
		ChildClass o1 = new ChildClass(); //자식 클래스 만들 때 부모클래스에 자동으로 인스턴스 만들어짐
		o1.method1();
	}

}
