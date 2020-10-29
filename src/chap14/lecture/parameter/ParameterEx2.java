package chap14.lecture.parameter;

public class ParameterEx2 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int a, int b) ->System.out.println(a+b);
		o1.method(3,10);
		
		MyInterface2 o2 = (a, b) -> System.out.println(a+b);
		o2.method(3, 4);
		
		MyInterface2 o3 = a,b -> System.out.println(a+b);
		o3.method(7, 8);
	}
}
