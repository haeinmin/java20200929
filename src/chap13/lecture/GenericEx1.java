package chap13.lecture;

public class GenericEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.method1();
		o1.method2(new Object());
		o1.method2("java");
		o1.method2(300);
		//여기서는 t를 결정 안 해서 아무 타입이나 가능
		
		MyClass<String> o2 = new MyClass</*String 뒤는 생략 가능*/>(); //<T>에는 generic이었다가 이제 String으로 특정 타입이 됨
		o2.method1();
		o2.method2("java");
		// o2.method2(new Object());
		
		MyClass<Integer> o3 = new MyClass</*Integer*/>();
		o3.method2(100);
		o3.method2("java"); //string 못 넣음 int로 결정해서
	}
}
