package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackAndQueue {

	public static void main(String[] args) {
		Queue q = new LinkedList();
		
		q.offer("1");
		q.offer("2");
		q.offer("3");
		System.out.println(q.isEmpty());
		
		
		q.poll();q.poll();q.poll();
		System.out.println(q.isEmpty());
	}

}
