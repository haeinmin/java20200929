package chap03.binary;

public class ConcatOperator {
	public static void main(String[] args) {
		//연결연산자 concatenate
		int a = 3;
		int b = 5;
		int c = a + b;
		
		String s = "9";
//		int d = a + s; //int type + sting type 불가
		
		String d = a + s;
		
		System.out.println(d); //39라는 string으로 출력
		
		String e = a + b+ s;
		System.out.println(e); //89
		
		String f = s + b+ a;
		System.out.println(f);
		
		
	}

}
