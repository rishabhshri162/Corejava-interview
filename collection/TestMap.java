package collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		map.put(4, 50);
		map.put(1, 10);
		map.put(3, 30);
		map.put(2, 20);
		map.put(null, 20);
		map.put(5, null);

		System.out.println(map.get(1));

		System.out.println(map.containsKey(1));

		System.out.println(map.containsValue("Two"));

		System.out.println(map);
		
	

//		map.clear();
//		map.remove(1);

	}
}
