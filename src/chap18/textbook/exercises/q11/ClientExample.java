package chap18.textbook.exercises.q11;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("172.30.1.1", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "pup.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
//		InputStream is = socket.getInputStream();
//		byte[] bytes = null;
//		bytes = new byte[100];
//		int readByteCount = is.read(bytes);
//		fileName = new String(bytes, 0, readByteCount);
		byte[] bytes = new byte[100];
		fileName.getBytes(0, fileName.length(), bytes, 0);
		
		
		
		System.out.println("[파일 보내기 시작]" + fileName);
//		FileInputStream fis = new FileInputStream("pup.jpg");
//		while(fis.read() != -1) {}
		FileInputStream fis = new FileInputStream(file);
		int len = 0;
		while ((len=fis.read(bytes)) != -1) {
			os.write(bytes, 0, len);
		}
		
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
