package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
	public static void main(String[] args) {

		Deque q = new ArrayDeque();
 
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		
		q.offerLast(20);
		q.offerFirst(30);

		System.out.println(q);

		System.out.println("peek : " + q.peekFirst());

		System.out.println(q);

		System.out.println("pop : " + q.pop());

		System.out.println(q);

		System.out.println("poll : " + q.pollFirst());

		System.out.println(q);
	}
}
