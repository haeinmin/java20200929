package chap06.lecture.packageKeyword;

import java.util.ArrayList;
import java.util.Scanner; //ctrl+shift+o 필요한 패키지 불러오는 단축키
import java.util.*; //java.util에 해당하는 모든 패키지 불러옴

// import java.lang.String; //java.lang에 속한 것들은 생략 가능

public class MyApp {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass o1 
		= new chap06.lecture.packageKeyword.MyClass();
		
		MyClass o2 = new MyClass();
		
		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		//이렇게 쓰는 대신 위에서 다른 패키지를 import하겠다고 선언할 수 있음
		Scanner s2 = new Scanner(System.in);
		
		java.lang.String str = "java";
		String str2 = "css";
		
		ArrayList list = new ArrayList();
		
	}

}
