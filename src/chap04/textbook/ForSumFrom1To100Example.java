package chap04.textbook;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i =1;
		for(; i<=100; i++) { //위에서 int i 선언했으므로 1항 비워도 됨
			sum += i;
		}
		System.out.println(i); //코드 블럭 내에서만 사용 가능한데 밖에 있으므로 위에서 int i를 선언해줘야 함
		System.out.println("1~" + (i-1) +" 합: " + sum);
	}

}
