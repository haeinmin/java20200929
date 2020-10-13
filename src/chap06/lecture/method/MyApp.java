package chap06.lecture.method;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.var1 = 3;
		o1.myMethod();
		
		MyClass o2 = new MyClass();
		o2.myMethod();
		
		o2.myMethod2(5); //parameter를 갖는 method의 경우 괄호 안을 공란으로 둘 경우 오류 발생
		o2.myMethod2(7);
		
		o1.myMethod2(9);
		
		o1.myMethod3(1, 23);
	}

}
