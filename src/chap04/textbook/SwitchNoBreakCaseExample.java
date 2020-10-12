package chap04.textbook;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재시간: " +time + " 시]");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 합니다.");
		}
	}

}

//break가 없으므로 case 하나에 해당되면 이후 것까지 연속으로 실행