package chap14.lecture.nested;

public class NestedEx1 {
	public static void main(String[] args) {
		
		MyInterface i1 = () -> System.out.println("실행");
		
		MyInterface i2 = new MyInterface() {
			public void method() {
				System.out.println("실행2");
			};
		};
		
		//위는 local class와 같음
		// 지역변수를 local class 내에서 쓰는 경우 이는 반드시 final이어야 함을 기억!
	}
}
