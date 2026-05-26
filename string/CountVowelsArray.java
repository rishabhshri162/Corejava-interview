package string;

public class CountVowelsArray {

	public static void main(String[] args) {

		String name = "rishabh";

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < vowels.length; i++) {

			int count = 0;

			for (int j = 0; j < name.length(); j++) {

				if (vowels[i] == name.charAt(j)) {
					count++;

				}
			}
			if (count > 0) {
//			if (count == 0) {
				System.out.println(vowels[i] + " = " +  count);
				
			}
		}
}
}