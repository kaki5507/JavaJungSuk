import java.util.ArrayList;

public class JungSuk134 {

	public static void main(String[] args) {
		// 지네릭스(Generics)란? 컴파일시 타입을 체크해 주는 기능
		// 객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여줌 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
//		list.add("30"); // String을 추가
		list.add(30); // 타입 체크가 강화됨. 지네릭스 덕분에
		
//		Integer i = (Integer)list.get(2); // 컴파일 OK
		Integer i = list.get(2); // 형변환 생략 가능
		System.out.println(list);
	}

}
