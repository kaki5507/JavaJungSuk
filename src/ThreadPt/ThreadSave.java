package ThreadPt;

public class ThreadSave implements Runnable{
	static boolean autosave = false; // 자동저장 false로 꺼놓음.

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadSave());
		t.setDaemon(true); // true를 하면 데몬쓰레드가 생성됨
		t.start();

		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000); //지연시간 1초로 줍니다.
			} catch (InterruptedException e) {}
			System.out.println(i);
			// i가 5가되면 true로 바뀝니다.
			if(i==5) {autosave = true;}
		}
		System.out.println("프로그램 종료");
	}

	// Runnable인터페이스 사용하려면 run 메서드를 오버라이딩 해야합니다.
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3 * 1000); // 3초마다 3*1000이 가독성에 더 좋음.
			} catch (InterruptedException e) {}

			if(autosave) autosave();
		}
		
	}

	public void autosave() {
		/* 실제 저장 코드가 들어오면 됨 */
		System.out.println("저장되었습니다.");
	}
	
}
