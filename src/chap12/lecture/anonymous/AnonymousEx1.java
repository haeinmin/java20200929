package chap12.lecture.anonymous;

public class AnonymousEx1 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i=0;i<5;i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=0;i<5;i++) {
					System.out.println((char) ('a' + i));
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread t3 = new Thread(() -> {
			for (int i=0;i<5;i++) {
				System.out.println((char) ('Z'-i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

// 클래스 따로 만들지 않고 클래스 생성과 상속을 한꺼번에 함