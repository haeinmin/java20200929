package chap11.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		// byte, short, int, long
		// char, boolean
		// float, double
		
		// 8개의 데이터타입에 해당하는 8개의 class
		// 즉, wrapper type은 primitive type을 reference type으로 변환
		// Byte, Short, Int, Long
		// Char, Boolean
		// Float, Double
		
		int i = 1;
		method1(i); //integer type이 object type으로 어떻게 무리없이 들어갔는지?
					//아래와 같이 boxing하는 code가 자동으로 들어감
					//autoboxing
		
		Integer in = Integer.valueOf(i);
		method1(in);
		
		int j = 2;
		method1(j);
		
		int k = in; //auto unboxing
		
		Integer in2 = 3;
		int m = in2;
		
	
	}
	
	public static void method1(Object o) {
		System.out.println(o);
	}
}
