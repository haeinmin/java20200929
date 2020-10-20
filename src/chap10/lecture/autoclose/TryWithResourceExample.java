package chap10.lecture.autoclose;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) { //cf.데이터베이스 코드 작성 시 자주 사용
			fis.read();
			throw new Exception(); //어디선가 작성된 코드로서 statement로 사용 가능
									//exception이 발생하지 않았음에도 close(); 발생
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}
