import java.util.ArrayList;

class Tv2{}
class Audio2{}

public class JungSuk135 {

	public static void main(String[] args) {
		// 클래스를 작성할 때, Object타입 대신 타입 변수(E)를 선언해서 사용.
		// 객체를 생성시, 타입 변수(E) 대신 실제 타입(Tv)을 지정(대입)
//		ArrayList list = new ArrayList();
		ArrayList<Tv2> list = new ArrayList<Tv2>(); // Tv타입의 객체만 저장가능
		list.add(new Tv2());
//		list.add(new Audio());
		
		Tv2 t = list.get(0); // list의 첫번째 요소를 꺼낸다.
	}

}