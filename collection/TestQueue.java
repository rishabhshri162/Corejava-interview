package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new ArrayBlockingQueue<Integer>(3);

		q.offer(800);
		q.offer(200);
		q.add(300);
	

		System.out.println(q.offer(300));
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		
		

		System.out.println(q);
	}
}
