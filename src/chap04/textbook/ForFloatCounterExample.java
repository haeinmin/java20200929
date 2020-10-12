package chap04.textbook;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		for(float x =0.1f; x<= 1.0f; x+=0.1f) {
			System.out.println(x); 
			//float type은 0.1을 정확하게 표현 불가.
			//따라서 x에 더해지는 값은 0.1보다 살짝 크고 루프는 9번만 실행
		}
	}

}
