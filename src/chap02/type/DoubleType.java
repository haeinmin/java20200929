package chap02.type;

public class DoubleType {
	public static void main(String[] args) {
		// double : 8byte
		
		double doubleValue = 3.14;
		System.out.println(doubleValue);
		
		doubleValue = 3e6; //3.0 * 10의6제곱
		System.out.println(doubleValue);
		
		//실수형 계산 시 주의
		double d1 = 0.1;
		double d2 = 0.2;
		double d3 = d1 + d2;
		System.out.println(d3);
		// 0.3을 예상했는데 0.30000000000000004 출력
		// 왜? 컴퓨터가 이진법으로 값을 저장하기 때문에 발생하는 오류 + 저장공간의 한계로 인한 오류
		// 이를 해결하는 방법은 기업마다 다를 것
	}

}
