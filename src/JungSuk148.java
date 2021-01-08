
public class JungSuk148 {

	public static void main(String[] args) {
		ThreadEE t1 = new ThreadEE();
		
		Runnable r = new ThreadER();
		Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)
		
		t1.start(); // 1이 먼저 나올때도 있음 os스케쥴러 마음대로임 
		t2.start();
	}

}
class ThreadEE extends Thread{
	public void run() { // 쓰레드가 수행할 작업 작성
		for(int i=0; i<500; i++) {
			System.out.print(0);
		}
	}
}
class ThreadER implements Runnable{
	public void run() { // 쓰레드가 수행할 작업 작성
		for(int i=0; i<500; i++) {
			System.out.print(1);
		}
	}
}