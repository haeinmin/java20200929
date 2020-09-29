package chap02.type;

public class CharType {
	public static void main(String[] args) {
		// char: 2byte
		// 작은 따옴표 이용하여 하나의 문자를 표현
		
		char charValue;
		charValue = 'a';
		System.out.println(charValue);
		
//		charValue = 'ab'; //두개의 문자
//		charValue = ''; //문자 없음
		charValue = ' ';
		
		charValue = 44032; //2byte 내 값은 표현 가능
		System.out.println(charValue);
		
		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00';
		System.out.println(charValue);
		
	}

}
