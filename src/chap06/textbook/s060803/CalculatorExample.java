package chap06.textbook.s060803;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.execute();
		
		myCalc.println(null); //@@@@@@@왜 아무 string이나 parameter로 받지 못하는지?
	}
}
