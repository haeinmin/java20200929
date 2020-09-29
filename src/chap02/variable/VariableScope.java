package chap02.variable;

public class VariableScope {
	public static void main(String[] args) {
		//변수의 사용 범위
		
		int a = 3;
		if (true) {
			int b = 5;
			System.out.println(a);
			System.out.println(b);
		}
		
		System.out.println(a);
//		System.out.println(b);
		//b는 위의 코드블럭 내에서만 존재함
		//즉, 변수는 선언된 코드블럭 내에서만 사용 가능
	}

}
