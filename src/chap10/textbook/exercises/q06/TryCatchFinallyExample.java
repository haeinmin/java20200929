package chap10.textbook.exercises.q06;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for(int i=0;i<=2;i++) { //i=0,1,2
			try {
				value = Integer.parseInt(strArray[i]); //strArray[1]일 때 value = ~~~~ 연산 실행 안 돼서 value 여전히 10
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과함");
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환 불가");
			} finally {
				System.out.println(value); 
			}
		}
	}
}


/*
10
숫자로 변환 불가
인덱스를 초과
*/