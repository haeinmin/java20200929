package chap04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		
		//1~10
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}	
		
		System.out.println("--------------");
		
		//11~20
		for(int j=11; j<21; j++) {
			System.out.println(j);
		}
		
		System.out.println("--------------");
		
		//1~9 홀수만
		for(int a=1; a<10; a+=2) {
			System.out.println(a);
		}
		
		System.out.println("--------------");
		
			
		//10~1
		for(int b=10; b>0; b--) {
			System.out.println(b);
		}
		
		System.out.println("--------------");
		
		//10~2 짝수만
		for(int c=10; c>1; c-=2) {
			System.out.println(c);
		}
	}

}
