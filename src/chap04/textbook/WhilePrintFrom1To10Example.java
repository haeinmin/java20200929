package chap04.textbook;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		
		//1~10
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("-----------");
		
		//11~20
		int j = 11;
		while (j<= 20) {
			System.out.println(j);
			j++;
		}

		System.out.println("-----------");
		
		//1~9 홀수만
		int a = 1;
		while (a<=9) {
			System.out.println(a);
			a+=2;
		}

		System.out.println("-----------");
		
		//10~1
		int b = 10;
		while (b>=1) {
			System.out.println(b);
			b--;
		}

		System.out.println("-----------");
		
		//10~2 짝수만
		int c = 10;
		while (c>=2) {
			System.out.println(c);
			c-=2;
		}
	}

}
