package chap04.textbook;

import java.util.Scanner;//이렇게 import해줘야 사용 가능

public class ___DoWhileExampleScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //나열된 text를 훑는 class
		
		System.out.println("입력");
		
		String line = scanner.nextLine();
		//string type 변수를 받고 string type으로 return
		
		System.out.println("출력");
		System.out.println(line);
	}
}
