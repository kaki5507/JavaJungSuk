package ThreadPt;

import javax.swing.JOptionPane;

public class ThreadInterrup {

	public static void main(String[] args) {
		Threadb1 b1 = new Threadb1();
		b1.start();
		System.out.println("isInterrupted() : " + b1.isInterrupted()); // false 상태

		String input = JOptionPane.showInputDialog("종료하시겠습니까?");
		b1.interrupt();
		System.out.println("isInterrupted() : " + b1.isInterrupted()); // true 상태
	}

}
class Threadb1 extends Thread{

	@Override
	public void run() {
		int i = 10;
		
		//i는 0이 아니고, 중단이 안되었으면 돌아가는 반복문
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<2500000000L;x++);
		}
		System.out.println("종료되었습니다.");
	}
	
}