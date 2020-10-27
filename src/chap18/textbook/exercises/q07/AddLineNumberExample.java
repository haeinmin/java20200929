package chap18.textbook.exercises.q07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/chap18/textbook/exercises/q07/AddLineNumberExample.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);

		String line;
		int lineNum = 0;
		
		while ((line = br.readLine()) != null) {
			lineNum++;
			System.out.println(lineNum + ": " + line);
		}
		
		
		
//		int data;
//		String line = "";
//		
//		while ((data = br.read()) != -1) {
//			line = br.readLine();
//			String[] lines = new String[line.length()];
//			for (int i=1;i<=lines.length;i++) {
//				System.out.println(i+ ": " + line);				
//			}
//
//		}
		
		
		fr.close();
		br.close();

	}
}