package CollectionsPt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list);
		
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list); // 전부다 넣음.
		
		Collections.rotate(list, 2);
		System.out.println(list); // 두 칸 밀림.
		
		Collections.swap(list,0,2);
		System.out.println(list); // 0번째랑 2번째 바뀜.
		
		Collections.shuffle(list);
		System.out.println(list); // 막 섞음.
		
		Collections.sort(list);
		System.out.println(list); // 정렬
		
		Collections.reverse(list);
		System.out.println(list); // 정렬
		
		Collections.sort(list,Collections.reverseOrder()); // 역순 정렬
		
		Collections.sort(list);
		System.out.println(list); // 정렬
		
		int idx = Collections.binarySearch(list, 3); // 3이 저장된 위치.
		System.out.println(idx);
		
		Collections.fill(list, 9); // list를 9로 채운다.
		System.out.println(list);
		
		// list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단 결과는 변경 불가.
		List newList = Collections.nCopies(list.size(), 2);
		
		System.out.println(Collections.disjoint(list, newList)); // 공통 요소가 없으면 true
	}

}
