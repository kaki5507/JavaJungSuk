package ThreadPt;

public class syn1 {

	public static void main(String[] args) {
		Runnable r = new Runn2();
		new Thread(r).start();
		new Thread(r).start();
	}

}
// 은행
class Account2{
	private int balance = 1000; // private으로 해야 동기화가 의미 있음. public이면 접근할 수 있음 ..
	
	public int getBalance() {
		return balance;
	}
	
	// 출금 하는 동안 출금을 실행시킬수 없으니깐 synchronized로 메서드 동기화 시켰음
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
			balance -= money;
		}
	}
	
}

class Runn2 implements Runnable{
	Account2 ac2 = new Account2();
	
	@Override
	public void run() {
		while(ac2.getBalance() > 0) {
			int money = (int)(Math.random()*3 +1) * 100;
			ac2.withdraw(money);
			System.out.println("잔고 : " + ac2.getBalance());
		}
	}
}