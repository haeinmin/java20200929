package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
		// 단항
		// ~ 반전
		int i = 10; //0000 0000 0000 0000 0000 0000 0000 1010
		int j = ~i; //1111 1111 1111 1111 1111 1111 1111 0101(binary) -11(decimal)
		System.out.println(j);
		
		// 이항
		// & and: 같은 자리의 bit가 1인 경우만 1, 나머지 0
		// | or: 같은 자리의 bit가 0인 경우만 0, 나머지 1
		// ^ xor: 같은 자리의 bit가 다를 경우 1, 같으면 0
		// 논리연산자 때는 양변 피연산자 boolean, 지금은 양변 integer
		// 결과도 integer
		
		int a = 45; //0010 1101 (binary)
		int b = 25; //0001 1001 (binary)
					//0000 1001 <- & 연산 시 같은 자리가 1인 경우만 1, 나머지는 0이므로
					// decimal 9
		int c = a & b;
		System.out.println(c);
		
		c = a | b; //0011 1101 (binary) 61 (decimal)
		System.out.println(c);
		
		c = a ^ b; //0011 0100 (binary) 52 (decimal)
		System.out.println(c);
		
		//bit shift 연산자
		// << : 각 bit를 왼쪽으로 옮김, 오른쪽은 0으로 채움
		// >> : 각 bit를 오른쪽으로 옮김, 왼쪽은 msb(Most Significant Bit) 최상위 비트(가장 왼쪽의 비트)로 채움 즉, 음수는 1로, 양수는 0으로
		// >>> : 각 bit를 오른쪽으로 옮김, 왼쪽은 0으로 채움
		
		//int val = 1;
		//val << 1; //한칸 왼쪽으로 0001에서 0010으로, 즉 x2
		
		int val = 56;
		int res = 56 << 2; //56 * 4
		System.out.println(res);
		
		val = 16;
		res = val >> 2; // 16 / 4
		System.out.println(res);
		
		val = -17; //binary 11111111111111111111111111101111
		res = val >> 1; //  11111111111111111111111111110111 decimal 9 (17-8)
		System.out.println(res);
		
		val = 16;
		res = 16 >>> 2;
		System.out.println(res); //양수일 때는 >>와 같은 값
		
		val = -17; // binary 11111111111111111111111111101111
		res = val >>> 1; //  01111111111111111111111111110111 decimal 2147483639
		System.out.println(res);
				
				
				
		// @@@@@@@질문
		// bit연산은 언제 쓰이는지? shift는 언제? 자주 쓰이지 않으나 코테나 알고리즘에서 볼 수도 있음
		// 왜 shit 왔다갔다하면 동일한 숫자 안 되는지? 1이 버려지고 0으로 채워져서
		
		
		
		
		
	}

}
