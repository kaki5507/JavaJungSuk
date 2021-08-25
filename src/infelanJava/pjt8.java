package infelanJava;

import java.util.Arrays;

public class pjt8 {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50,60};
		int arr2[] = null;
		int arr3[] = null;

		// 배열의 길이
		System.out.println("arr1.length = " + arr1.length);
		
		// 배열의 요소 출력
		System.out.println(Arrays.toString(arr1));
		
		// 배열의 요소 복사
		arr3 = Arrays.copyOf(arr1, 3);
		System.out.println(Arrays.toString(arr3));
	}

}
