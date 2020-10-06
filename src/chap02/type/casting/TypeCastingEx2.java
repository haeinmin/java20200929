package chap02.type.casting;

public class TypeCastingEx2 {
	public static void main(String[] args) {
		int intValue = 3;
		long longValue = 55;
		
//		int intValue2 = intValue + longValue;
//		long 타입이 더 크므로 int로 안 됨
		long longValue2 = intValue + longValue;
		
		double doubleValue = 3.14;
		
		// int intValue3 = intValue + doubleValue;
		// 이것 또한 결과가 실수이므로 불가능
		double doubleValue2 = intValue + doubleValue; //이렇게 작성해야 함
		
		//정수형의 연산결과는 int
		short shortValue1 = 3;
		short shortValue2 = 5;
		
		short shortValue3 = shortValue1 + shortValue2; //정수형의 연산결과는 int여야하므로 틀림
		int intValue4 = shortValue1 + shortValue2;
		
		
		
	}

}
