package string;

public class CountNoOfIntegerFromString {

	public static void main(String[] args) {

		String s = "Rishabh7897";
		
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
                count++;				
			}
		}
		if (count > 0) {
			System.out.println(count);
			
		}
			
		}

		

}
