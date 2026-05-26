package string;

import java.util.Arrays;

public class StringSeNikalKeArrayMeBharna {
	

		public static void main(String[] args) {

			String[] n = { "rishabh63636" };
			String result = "";
			for (String s : n) {
				for (int i = 0; i < s.length(); i++) {
					if (Character.isDigit(s.charAt(i))) {
						result = result + s.charAt(i);
					}
				}
			}
			int arr[] = new int[result.length()];
			for (int i = 0; i < result.length(); i++) {
				arr[i] = Character.getNumericValue(result.charAt(i));

			}
			System.out.println(Arrays.toString(arr));

		}
	}


