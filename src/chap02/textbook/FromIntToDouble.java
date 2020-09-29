package chap02.textbook;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		System.out.println(num3);
		
		num2 = (int) num3;
		System.out.println(num2);
		
		int result = num1 - num2;
		System.out.println(result);
	}

}

//double type으로 변환 시 float type으로 변환했을 때와 같은 오류 발생 안 함.

