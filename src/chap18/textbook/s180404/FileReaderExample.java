package chap18.textbook.s180404;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(
				"src/chap18/textbook/s180404/FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100]; //문자를 읽기 때문에 캐릭터를 읽고 캐릭터 배열에 저장
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}
