package chap10.textbook.s100201;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null;

		if (data != null) {
			System.out.println(data.toString());
		}
	}
}
