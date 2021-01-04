// Collections를 생략가능하게 해준다.
import static java.util.Collections.*;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class JungSuk133 {

	public static void main(String[] args) {
		// Collections - 컬렉션을 위한 메서드(static)를 제공
		// 컬레션의 동기화 - synchronizedXXX() , 변경불가(readOnly) - unmodifiableXXX()
		// 싱글톤 컬렉션 - singletonXXX() 객체1개만 저장 , 한 종류의 객체만 저장 - checekedXXX()
		
		List list = new ArrayList();
		System.out.println(list);
		
//		Collections.addAll(list, 1,2,3); 생략
		addAll(list,1,2,3,4,5,6);
		
		rotate(list, 2); // 오른쪽으로 두 칸씩 이동
		System.out.println(list);
		
		swap(list, 0,2); // 첫번째와 세 번째를 교환 (swap)
		System.out.println(list);
		
		shuffle(list); // 저장된 요소의 위치를 임의로 변경
		System.out.println(list);
		
		sort(list, reverseOrder()); // 역순정렬 
		System.out.println(list);
		
		sort(list); // 정렬
		System.out.println(list);
		
		int idx = binarySearch(list, 3); // 3이 저장된 위치
		System.out.println("index of 3 = "+idx);
		
		System.out.println("max = "+max(list));
		System.out.println("min = "+min(list));
		System.out.println("max = "+max(list,reverseOrder()));
		
		fill(list, 9); // list를 9로 채운다.
		System.out.println("list="+list);
		
		List newList = nCopies(list.size(), 2); // list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단 , 결과는 변경불가
		System.out.println("newList = "+newList);
		
		System.out.println(disjoint(list,newList)); // 공통요소가 없으면 true
		
		copy(list, newList);
		System.out.println("newList = "+newList);
		System.out.println("list="+list);
		
		replaceAll(list, 2, 1);
		System.out.println("list="+list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		System.out.println("list2 = "+list2);
	}

}
