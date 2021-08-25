package ThreadPt;

import javax.swing.JOptionPane;

public class Thread2Multi {

	public static void main(String[] args) {
		Th2 th = new Th2();
		th.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("당신이 입력하신값은 : " + input + " 입니다.");
		

	}

}
class Th2 extends Thread{

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}