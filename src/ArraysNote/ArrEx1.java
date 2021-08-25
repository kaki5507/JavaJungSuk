package ArraysNote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrEx1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Arrays.fill(arr, (int)(Math.random()*10)+1);
		System.out.println(Arrays.toString(arr));
		Arrays.setAll(arr, (i) -> (int)(Math.random()*10)+1);
		System.out.println(Arrays.toString(arr));
		
		Stack st = new Stack();
		st.push(null);
		System.out.println(st);
		
		Queue<Integer> q = new LinkedList();
		q.offer(null);
		q.offer(1);
		q.offer(5);
		System.out.println(q);
	}

}
