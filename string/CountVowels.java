package string;

public class CountVowels {

	public static void main(String[] args) {

		String name = "google";
		
		int count = 0;
		
		for(int i = 0; i < name.length(); i++) {
			
			char ch = name.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                   count++;				
			}
		}
		
		if (count > 0) {
			System.out.println(count);
			
		}

	}
}