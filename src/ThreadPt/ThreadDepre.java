package ThreadPt;

public class ThreadDepre {

	public static void main(String[] args) {
		MyThread th1 = new MyThread("1");
		MyThread th2 = new MyThread("22");
		MyThread th3 = new MyThread("333");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend(); // 쓰레드 th1 잠시 중단
			Thread.sleep(2 * 1000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume(); // 쓰레드 th1이 다시 동작하도록
			Thread.sleep(4000);
			th1.stop(); // 쓰레드 th1 강제종료
			th2.stop();
			Thread.sleep(4000);
			th3.stop();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

class MyThread implements Runnable{
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	
	MyThread(String name){
		th = new Thread(this, name); // Thread(Runnable r, String name);
	}
	
	void start() {
		th.start();
	}
	
	void stop() {
		stopped = true;
	}
	
	void suspend() {
		suspended = true;
	}
	
	void resume() {
		suspended = false;
	}
	@Override
	public void run() {
		while(!stopped) { // 멈추면 반복문 끝
			if(!suspended) { // 정지되지 않았으면 ?
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}else {
				Thread.yield();
			}
		}
	}
}