package GenericPt;

import java.util.ArrayList;

class Tv{}
class Audio{}

public class GenericTests1 {

	public static void main(String[] args) {
		ArrayList<Tv> list = new ArrayList<Tv>();
		list.add(new Tv());
		
		Tv t = list.get(0); // list의 첫번째 요소를 꺼낸다.
		
		
		
		
		/*
		list.add(10);
		list.add(20);
		list.add("30"); // String을 추가
		
		Integer i = (Integer)list.get(2); // 컴파일 OK 실행시 에러
		// 형 변환 에러가 남.
		System.out.println(list);
		*/
		
	}

}
