package chap09.lecture.localClass;

public class MyApp2LocalVariable {
	public static void main(String[] args) {
		
		int i = 1; //묵시적으로 final
		
		class LocalClass {
			void method1() {
				System.out.println(i); //즉 final만 가능
				System.out.println(args);
//				i += 1; //접근할 때는 지역변수의 값 변경 불가
			}
		}
		
//		args = new String[3]; //변경 불가
//		i += 1; //밖에서도 변경 불가
	}
}
