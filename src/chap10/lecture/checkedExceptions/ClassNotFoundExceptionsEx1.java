package chap10.lecture.checkedExceptions;

public class ClassNotFoundExceptionsEx1 {
	public static void main(String[] args) {
		System.out.println("run program1");
		try {			
			System.out.println("프로그램 실행 try1");
			Class.forName("java.lang.String2"); //여기서 exception 발생 시 try2만 실행 x
			System.out.println("프로그램 실행 try2");
		} catch (ClassNotFoundException e) { //exception 발생 시 catch하여 블록 실행
			System.out.println("exception occured");
		} finally {
			System.out.println("무조건 실행!!!!!!!!"); //exception 발생 유무와 관계없이 무조건 실행
		}
		System.out.println("run program2"); //try-catch를 사용하는 이유는 코드 흐름을 유지하기 위함이므로 exception 발생해도 이는 실행
	}
}
