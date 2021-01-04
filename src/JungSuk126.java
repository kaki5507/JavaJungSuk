import java.util.Arrays;
import java.util.Comparator;

public class JungSuk126 {

	public static void main(String[] args) {
		// Comparator와 Comparable
		// 객체 정렬에 필요한 메서드 (정렬기준 제공)를 정의한 인터페이스
		String []arr = {"cat","Dog","lion","tiger"};
		
		Arrays.sort(arr);
		System.out.println("arr = "+Arrays.toString(arr)); // 대문자 먼저
		
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함
		System.out.println("arr = "+Arrays.toString(arr));
		
		Arrays.sort(arr, new Descending()); // 역순 정렬
		System.out.println("arr = "+Arrays.toString(arr));
	}
}
class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2)*-1;
		}
		return -1;
	}
}