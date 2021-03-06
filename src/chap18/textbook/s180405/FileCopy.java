package chap18.textbook.s180405;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		
		// reader, writer 사용해서 복사
		
		Reader reader = new FileReader(src);
		Writer writer = new FileWriter(des);
		
		int readCharNo;
		String data = "";
		
		char[] cbuf = new char[100]; 
		while ((readCharNo = reader.read(cbuf)) != -1) {
			data = new String(cbuf, 0, readCharNo);
			writer.write(data);
		}
		
		/* 배열이 아닌 한 문자씩 읽기
		 int data;
		 while ((data = reader.read()) != -1) {
		 	writer.write(data);
		 }
		 */
		
		reader.close();
		writer.close();
	
	}
}
