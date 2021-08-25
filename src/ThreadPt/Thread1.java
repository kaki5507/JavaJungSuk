package ThreadPt;

public class Thread1 {

	public static void main(String[] args) {
//	MyThread t1 = new MyThread();
	
	Runnable r = new MyThread2();
	Thread t2 = new Thread(r);
	
//	t1.setPriority(7);
//	t1.start();
	t2.start();

	}

}

//class MyThread extends Thread{
//
//	@Override
//	public void run() { // Thread클래스를 상속해서 쓰레드를 구현
//		for(int i=0; i<1000; i++) {
//			System.out.print("1"); // 조상인 Thread의 getName()을 호출
//		}
//	}
//	
//}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			System.out.print("2");
		}
	}
	
}
