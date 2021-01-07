class Parent{
	void parentMethod() {}
}

class Child extends Parent{
	@Override
	@Deprecated // 줄을 그어서 보여줌
	void parentMethod() {} // 조상 메서드의 이름을 잘못 적었음.
}

@FunctionalInterface // 함수형 인터페이스는 하나의 추상 메서드만 ㄱ나ㅡㅇ
interface Testable{ 
	void test(); // 추상메서드
//	void check(); // 추상메서드
}
public class JungSuk144 {
	@SuppressWarnings("deprecation") // 컴파일 하면 경고 안뜸
	public static void main(String[] args) {
		/*
		   @Override - 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
		      오버라이딩할 때 메서드이름을 잘못적는 실수를 하는 경우가 많다.
		 */
	
		/*
		   @Deprecated - 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
		   @Deprecated의 사용 예, Date클래스의 getDate()
		 */
		/*
		  @FunctionalInterface - 함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
		    함수형 인터페이스에는 하나의 추상메서드만 가져야 한다는 제약이 있음
		 */
		/*
		  @SuppressWarnings - 컴파일러의 경고메시지가 나타지 않게 억제한다.
		  - 괄호()안에 억제하고자하는 경고의 종류를 문자열로 지정
		 */
		Child c = new Child();
		c.parentMethod(); // deprecated된 메서드사용
	}

}
