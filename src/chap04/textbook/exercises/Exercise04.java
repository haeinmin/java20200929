package chap04.textbook.exercises;

public class Exercise04 {
	public static void main(String[] args) {
		int a = (int) Math.random()*6 +1;
		int b = (int) Math.random()*6 +1; 
		
		while (a+b!=5 && a+b<=12) {
			System.out.println("(" + a + "," + b + ")");
			
		} 
	}

	
}

