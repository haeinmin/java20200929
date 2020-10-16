package chap07.lecture.casting;

public class ___MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		SuperClass[] arr = new SuperClass[3];
		arr[0] = new SubClass();
		method3(new SubClass());
		
		o1.method1();
		
		SubClass o2 = (SubClass) o1; //강제형변환 괄호 안에 변환 도착 type 작성 //but 오류 가능
		
		o2.method2();
	}
	
	public static void method3(SuperClass s) {
		s.method1();
	}

}
