package chap12.textbook.s120201;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); //500ms만큼 실행을 잠시 멈춤 (두 실행 간 500ms pause)
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			for (i=0; i<5; i++) {
				System.out.println("띵");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
