package collection;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(10);
		s.push(20);
		s.push(null);
		s.push(30);
		s.push(40);
		
		System.out.println(s);
		
		System.out.println(s.peek()); // Last in First out
		
		System.out.println(s);
		
		System.out.println(s.pop());
		
		System.out.println(s);
	}
}
