package chap02.type;

public class LongType {
	public static void main(String[] args) {
		// long : 8byte(64bit)
		// 최대: 9223372036854775807
		// 최소: -9223372036854775808
		
		long longValue;
		longValue = 9223372036854775807L;
		// int의 범위를 벗어날 수 없으므로 숫자만 작성 시 오류 뜸
		// 따라서 해당 수를 출력하려면 이게 long의 범위에 속한다는 것을 표시하기 위해서 끝에 L 써야 함
		System.out.println(longValue);
		
		longValue = 9_223_372_036_854_775_807L;
		
		longValue = -9223372036854775808L
	}
}

