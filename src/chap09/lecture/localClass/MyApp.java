package chap09.lecture.localClass;

public class MyApp {
	public static void main(String[] args) {
		int i = 3;
		System.out.println(i); //method 안 쪽에서만 쓰이는 변수는 local variable
		
		class LocalClass {
			int i;
			static int j;
			
			void method() {}
			static void method2() {}
		}
		
		LocalClass l1 = new LocalClass();
	}
}
