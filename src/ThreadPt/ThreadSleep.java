package ThreadPt;

public class ThreadSleep {

	public static void main(String[] args) {
		Threada1 th1 = new Threada1();
		Threada2 th2 = new Threada2();
		
		th1.start();
		th2.start();
		
		delay(2000); //또는 2 * 1000
		System.out.print("●메인 종료●");
	}
	
	static void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {}
	}

}
class Threada1 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print("a1");
		}
		System.out.print("●th1 종료●");
	}
	
}
class Threada2 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print("a2");
		}
		System.out.print("●th2 종료●");
	}
	
}