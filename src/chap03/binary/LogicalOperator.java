package chap03.binary;

public class LogicalOperator {
	public static void main(String[] args) {
		// 논리연산자
		// && and
		// || | or : 양변이 false 일 때만 false
		// ^ xor (exclusive or, 배타적논리합) : 다를 때만 true
		
		System.out.println("=====and=====");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("=====or=====");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("=====xor=====");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("=====&|=====");
		int a = 3;
		System.out.println(false & false);
		System.out.println(false & true);
		System.out.println((a < 0) & (a++ < 0));
		System.out.println(a);
		
		System.out.println("=====&&|=====");
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println((a < 0) && (a++ < 0)); 
		//여기서 a++는 그대로 4
		// &&와 &의 차이는 &는 연산을 하고 &&은 안 함
		System.out.println(a);
	}
}
