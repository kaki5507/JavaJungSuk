
package ArraysNote;
import java.util.*;

public class BinarySortEx {

	public static void main(String[] args) {
		int[] arr = {3,2,5,6,2};
		System.out.println(Arrays.toString(arr));
		int idx = Arrays.binarySearch(arr, 2);
		System.out.println(idx);
		Arrays.sort(arr);
		int idx2 = Arrays.binarySearch(arr, 2);
		System.out.println(Arrays.toString(arr));
		System.out.println(idx2);
		
	}

}
