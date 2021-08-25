package ThreadPt;

public class ThreadJY {
	static long startTime = 0;
	
	public static void main(String[] args) {
		Thread_1 th1 = new Thread_1();
		Thread_2 th2 = new Thread_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
//		try {
//			th1.join(); // main쓰레드가 th1의 작업이 끝날때 까지 기다림.
//			th2.join(); // main쓰레드가 th2의 작업이 끝날때 까지 기다림.
//		} catch (InterruptedException e) {}
//		
		System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime));
	}

}
class Thread_1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("☆"));
		}
		
	}
}
class Thread_2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("★"));
		}		
	}
}