package string;

public class LowerUppercase {

	public static void main(String[] args) {

		String str = "rishabh";

		for (int i = 0; i < str.length(); i++) {
			
			if (i % 2 == 0) {
				
				String s = String.valueOf(str.charAt(i));
				System.out.print(s.toUpperCase());
			}else {
				String s1 = String.valueOf(str.charAt(i));
				System.out.print(s1.toLowerCase());
				
			}

		}
	}

}
