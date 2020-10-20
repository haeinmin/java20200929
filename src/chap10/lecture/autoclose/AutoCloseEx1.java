package chap10.lecture.autoclose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseEx1 {
	public static void main(String[] args) {
		
		//OLD VERSION
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");
			// fis.close();			 //원래는 finally block 안에 있어야 함
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		}
		
		//NEW VERSION
		//try-with-resource
		
		try (FileInputStream fis2 = new FileInputStream("file.txt");
			FileInputStrea fis3 = new FileInputStream("file2.txt");) { 
			//둥근괄호 안에 statement 작성하면 알아서 null check, close method 생성
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
