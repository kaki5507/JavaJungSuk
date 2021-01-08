
public class JungSuk149 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEE2 t3 = new ThreadEE2();
		ThreadER2 t4 = new ThreadER2();
		t3.start();
		t4.start();
		startTime = System.currentTimeMillis();
		
		try {
			t3.join(); // main 쓰레드가 t3의 작업이 끝날 때까지 기다린다.
			t4.join(); // main 쓰레드가 t4의 작업이 끝날 때까지 기다린다.
		} catch (InterruptedException e) {}

			System.out.println("소요시간"+(System.currentTimeMillis() - startTime));
		
	}

}
class ThreadEE2 extends Thread{
	public void run() { 
		for(int i=0; i<300; i++) {
			System.out.print(new String("-"));
		}
	}
}
class ThreadER2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("I"));
		}
	}
}