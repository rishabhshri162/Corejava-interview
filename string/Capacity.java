package string;

public class Capacity {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("rishabh");
		
		System.out.println("length:" + sb.length());
		System.out.println("capacity:" + sb.capacity());
		
		System.out.println(sb.append("abcdefghijklmnopqrstuvwxyz"));
		System.out.println("length:" + sb.length());
		System.out.println("capacity:" + sb.capacity());
		
		System.out.println(sb.append("efg"));
		System.out.println("length:" + sb.length());
		System.out.println("capacity:" + sb.capacity());

	}
}