package ThreadPt;

public class syn2 {

	public static void main(String[] args) {
		Runnable r = new Runn2();
		new Thread(r).start();
		new Thread(r).start();
	}

}
// 은행
class Account3{
	private int balance = 1000;
	
	public synchronized void withdraw(int money) {
		while(balance < money) {
			try {
				wait(); // 대기 - 락을 풀고 기다린다. 통지를 받으면 락을 재획득(ReEntrace)
			} catch (InterruptedException e) {}
		}
		balance -= money;
	}
	
	public synchronized void deposit(int money) {
		balance += money;
		notify(); // 통지 - 대기중인 쓰레드 중 하나에게 알림. ( 하나 ? )
	}
	
}
