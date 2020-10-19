
package chap09.lecture.nestedClass;

public class MyApp {
	public static void main(String[] args) {
		MyClass.Class2 o1 = new MyClass.Class2(); //이건 static class라 class를 통해 접근 가능
		
		MyClass c1 = new MyClass(); //but 여기서는 instance를 통해서만 접근 가능하므로
		MyClass.Class1 o2 = c1.new Class1();
	}
}
