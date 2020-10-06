package chap03.textbook;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try { //시도를 먼저 해봄
			int result = safeAdd(2_000_000_000, 2_000_000_000);
			System.out.println(result);
		} catch(ArithmeticException e) { //예외 발생 시 catch 실행
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}
	
	public static int safeAdd(int left, int right) { //method는 js의 function처럼 parameter 가질 수 있음
		if((right>0)) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}

}
