import java.util.ArrayList;
import java.util.Collections;

public class JungSuk120 {

	public static void main(String[] args) {
		// 기본 길이가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
//		list1.add(new Integer(5)); 
		// autoboxing에 의해 기본형이 참조형으로 자동 변환
        list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 1제외 4제외 사이
		
		System.out.println(list2);
		
		// Collection은 인터페이스 , Collections는 유틸 클래스
		Collections.sort(list1);
		System.out.println(list1); // 오름 차순 정렬
		System.out.println(list2);
		
		// list1이 list2의 모든 요소를 포함하고 있냐? true
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		
		// 추가 메서드
		list2.add("B");
		System.out.println(list2);
		list2.add(3,"A");
		System.out.println(list2);
		
		list2.set(3, "AA");
		System.out.println(list2);
		
		System.out.println("index="+list1.indexOf(new Integer(2)));
		list1.remove(2); 
		System.out.println(list1);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다
		System.out.println("list1.retainAll(list2)"+list1.retainAll(list2));
		System.out.println(list1);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		System.out.println(list1);
		System.out.println(list2);
	}

}
