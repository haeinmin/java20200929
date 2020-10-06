package chap03.textbook.exercises;

public class Exercise {
	public static void main(String[] args) {
		System.out.println("----문제 2번----");
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); // 31 = 11 + 20
		System.out.println(z);
		
		System.out.println("----문제 3번----");
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result);
		
		System.out.println("----문제 4번----");
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = pencils % students;
//		int pencilsLeft = pencils - students * pencilsPerStudent;
		System.out.println(pencilsLeft);
		
		System.out.println("----문제 5번----");
		int value = 356;
		System.out.println(value - (value%100));
		
		System.out.println("----문제 6번----");
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double) (lengthBottom+lengthTop) * height / 2;
		System.out.println(area);
		
		System.out.println("----문제 7번----");
		int x1 = 10;
		int y1 = 5;
		System.out.println( (x1>7) && (y1<=5) );
		System.out.println( (x1%3 == 2) || (y1%2 != 1) );
		
		System.out.println("----문제 8번----");
		double x2 = 5.0;
		double y2 = 0.0;
		double z2 = x2 % y2;
		
		if (Double.isNaN(z2)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result1 = z2 + 10;
			System.out.println("결과:" + result1);
		}
				
	}

}
