package string;

public class CountOccuranceOfaChar {

	public static void main(String[] args) {
		
		String str = "rishabh";
		
		int count = 0;
		
		char ch = 'h';
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
				
			}
			
		}
		System.out.println(ch + "=" + count);

	}
}