package chap05.textbook;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		// 실행 시 가장 먼저 실행되는 부분이 main method
		// string 배열 타입을 받고 있음
		// 현재는 args length가 0
		// notepad에서 java MainStringArrayArgument 다음에 space 이후 요소 넣어주면 그 개수만큼 length 됨 (space로 구분)
		// eclipse에서는 run configurations > argument 사용
		
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
					// String의 valueOf와 비슷한 기능
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
