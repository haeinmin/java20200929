package chap18.lecture.filterstream;

import java.io.IOException;

public class InputStreamReaderEx2 {
	public static void main(String[] args) throws Exception {
		
		System.out.println("입력>");
//		System.in; //keyboard input
		System.out.println((char) System.in.read());
		System.out.println((char) System.in.read());
		System.out.println((char) System.in.read());
		System.out.println((char) System.in.read());
		
		//keyboard input을 문자 단위로 받기 위해서는 System.in을 inputStreamReader로 감싸야 함
		
		
	}
}
