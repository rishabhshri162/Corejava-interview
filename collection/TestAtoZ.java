package collection;

import java.util.Stack;

public class TestAtoZ {

	public static void main(String[] args) {

		Stack s = new Stack();
		
		for(char ch ='a'; ch<='z'; ch++) {
			System.out.println(s.push(ch));
		}
		
		Stack s1 = new Stack();
		
		while(!s.empty()) {
		System.out.print(s1.push(s.pop()));
	}}
}
