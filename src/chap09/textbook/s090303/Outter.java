package chap09.textbook.s090303;

public class Outter {
	public void method1(/*final*/ int arg) {
		int localVariable = 1; //java8 이후에는 이 앞에 final 안 붙여도 됨
		// arg = 100;
		// localVariable = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	
}
