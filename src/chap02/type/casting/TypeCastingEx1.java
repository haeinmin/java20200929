package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		// primitive type 8ro
		
		//  1byte   2byte   4byte   8byte
		// boolean   char
		// byte     short    int     long
		//                  float   double
		
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 1000000000L;
		
		// 자동 type 변환
		shortValue = byteValue; //short 타입에 byte type value 옮겨담는 것 문제 없음.
		intValue = shortValue;
		longValue = intValue;
		
		// 강제 type 변환
//		intValue = longValue; 
		//이 경우 문제가 생길 수도 있음. 왜? long type이 int가 포함할 수 있는 값에 포함되더라도 compile 오류
		// 따라서 강제로 type 변환 시 앞에 명시를 해야 함.
		intValue = (int) longValue;
		System.out.println(intValue);
		// 단 예상치 못한 값이 출력될 수도 있으니 안전할 떄만 사용할 것
		
		// 자동 type 변환 (정수->실수)
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		doubleValue = intValue;
		floatValue = intValue;
		
		longValue = 9223372036854775807L;
		floatValue = longValue;
		System.out.println(floatValue);
		
		doubleValue = longValue;
		
		// 강제 type 변환 (실수 -> 정수)
		intValue = (int) floatValue;
		
	}

}
