package chap18.lecture.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx2 {
	public static void main(String[] args) throws Exception {
		String source = "pup.jpg"; //원본 파일 이름
		String copy = "pup-copy.jpg"; //생성될 복사 파일 이름
		
		InputStream is = new FileInputStream(source);
		OutputStream os = new FileOutputStream(copy);
		
		int b = 0;
		while ((b = is.read()) != -1) {
			os.write(b); //b가 없어질 때까지 작성
		}
		System.out.println("복사 완료");
		
		is.close();
		os.close();
	}
}
