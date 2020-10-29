package chap12.textbook.s120202;

public class BeepPrintExample {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start(); //메모리a에서 실행
	
		for(int i=0; i<5; i++) { //메모리b에서 동시에 실행
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
