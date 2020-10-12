package chap04.textbook;

public class ___WhileKeyControlExample {
	public static void main(String[] args) throws Exception {

		/*
		 * System.out.println("입력"); System.in.read();//실행 시 "입력"만 출력되는데 이게 아직 실행 중이어서
		 * 그럼 //read method란? //returns integer type
		 * 
		 * System.out.println("출력");
		 * 
		 * //
		 * 
		 * System.out.println("입력"); int i = System.in.read(); int j = System.in.read();
		 * int k = System.in.read();
		 * 
		 * System.out.println("출력"); System.out.println(i); // 0 입력 시 48 출력 // 0이라는 값이
		 * 48이라는 integer 가짐 System.out.println(j); System.out.println(k);
		 */

		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) { //remove enter???????
				System.out.println("----------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("----------------");
				System.out.println("선택: ");
			}

		keyCode = System.in.read();

		if (keyCode == 49) {
			speed++;
			System.out.println("현재 속도 =" + speed);
		} else if (keyCode == 50) {
			speed--;
			System.out.println("현재 속도 = " + speed);
		} else if (keyCode == 51) {
			run = false;
		}
	}
		System.out.println("프로그램 종료");
	
}

}
