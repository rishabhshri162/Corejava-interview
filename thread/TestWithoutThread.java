package thread;

import thread.WithoutThread;

public class TestWithoutThread {

	public static void main(String[] args) {

		WithoutThread t1 = new WithoutThread("Ram");
		WithoutThread t2 = new WithoutThread("Shyam");

		t1.run();
		t2.run();

	}
}
