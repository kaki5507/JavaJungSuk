package lamdaPt;

@FunctionalInterface
interface MyFunction2{
	void run(); // 인터페이스 추상 메서드이므로 public static 생략됨!
}

public class lamda2 {
	static void execute(MyFunction2 f) {
		f.run();
	}
	
	static MyFunction2 getMyFunction() {
		return () -> System.out.println("f3.run()");
	}
	
	public static void main(String[] args) {
		// 람다식으로 MyFunction의 run()을 구현
		MyFunction2 f1 = ()-> System.out.println("f1.run()");
		
		MyFunction2 f2 = new MyFunction2() { // 익명클래스로 run()을 구현
			public void run() { // public 안붙이면 default가 기본값인데 조상님이 public이므로 붙여줘야 에러가 나지 않습니다 ★
				System.out.println("f2.run()");
			}
		};
		
		MyFunction2 f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(()-> System.out.println("run()"));
	}

}
