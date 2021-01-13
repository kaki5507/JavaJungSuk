
public class JungSuk150 {

	public static void main(String[] args) {
		// 작업의 중요도에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업시간을 갖게 할 수 있다.
		ThreadEx61 th1 = new ThreadEx61();
		ThreadEx62 th2 = new ThreadEx62();
		
//		th1.setPriority(5); // 이부분이 생략된 것
		th2.setPriority(7); // 쓰레드2의 우선순위를 7로 설정 5가 기분
		
		// console
		System.out.println("th1(-)"+th1.getPriority());
		System.out.println("th2(-)"+th2.getPriority());
		th1.start();
		th2.start();
		// 꼭 우선순위가 높다고 빨리 끝나는 것이 아님.
	}

}
class ThreadEx61 extends Thread{
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
			for(int x=0; x < 10000000; x++); // 시간지연
		}
	}
}
class ThreadEx62 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
			for(int x=0; x<10000000; x++);
		}
	}
}