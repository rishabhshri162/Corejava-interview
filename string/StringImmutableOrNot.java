package string;

public class StringImmutableOrNot {

	public static void main(String[] args) {

		// string is immutable agar object bn gya to change nahi hoga

		String s1 = "Rishabh";

		s1.concat("Shrivastava");

		System.out.println(s1);
		
		
		
		//object me hold krwa kr krenge to ho jayega change
		
		String s2 = "Rishabh";
		
		s2 = s2.concat(" Shrivastava");
		
		System.out.println(s2);
		
		
		
		//stringbuffer is mutable
		
		StringBuffer sb = new StringBuffer("Rishabh");
		
		sb.append("shrivastava");
		
		System.out.println(sb);

	}

}
