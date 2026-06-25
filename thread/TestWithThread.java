package thread;

public class TestWithThread {

	public static void main(String[] args) {

		WithThread t1 = new WithThread("rishabh");
		WithThread t2 = new WithThread("shrivastava");

		t1.start();

		t2.start();

	}
}
