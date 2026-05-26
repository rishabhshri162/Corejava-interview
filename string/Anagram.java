package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "irshabh";
		String s2 = "rishabh";

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println("this is anagram");

		} else {
			System.out.println("this is not anagram");
		}

	}
}