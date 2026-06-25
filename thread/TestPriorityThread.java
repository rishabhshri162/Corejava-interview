package thread;

public class TestPriorityThread {

	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("Abc");
		PriorityThread t2 = new PriorityThread("Xyz");

		t1.setPriority(1);
		t2.setPriority(10);

		t1.start();
		t2.start();

		System.out.println(t2.getPriority());
	}
}
