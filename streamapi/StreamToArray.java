package streamapi;

import java.sql.Array;
import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("a", "b", "c");

		String[] sa = s.toArray(e -> new String[e]);

		System.out.println(sa[0]);
	}

}
