package chap02.type;

public class ShortType {
	public static void main(String[] args) {
		// short : 2byte
		short shortValue1;
		shortValue1 = 32767; //최대값
		System.out.println(shortValue1);
		
//		shortValue1 = 32768; //최대값보다 크므로 invalid value
		shortValue1 = -32768; //최솟값
		System.out.println(shortValue1);
	}
}
