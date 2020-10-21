package chap10.lecture.runtimeExceptions.throwsKeyword;

public class ThrowsEx1 {
	public static void main(String[] args) throws ClassNotFoundException { //여기서는 JVM에 책임 떠넘김
		method1();
	}

	public static void method1() throws ClassNotFoundException {
		method2();
	}

	public static void method2() throws ClassNotFoundException {
		method3();
	}

	public static void method3() throws ClassNotFoundException { // throws를 통해 떠넘김으로서 이를 호출한 곳에서 책임 발생
										// exception이 두 개 이상일 경우 상위인 ***throws Exception***으로 바꿔도 됨
		Class.forName("java.lang.String2");
		FileReader fr = new FileReader("file.txt");
	}
}