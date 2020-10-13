package chap06.textbook.s060801;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 9);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); //@@@@@@@@@설계도에서는 int라고 했는데 같은 정수 타입이라 충돌 x?
		System.out.println("result2: " + result2);
		myCalc.powerOff();
	}

}
