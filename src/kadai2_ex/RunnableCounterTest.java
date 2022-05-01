package kadai2_ex;

public class RunnableCounterTest {
	public static void main(String[] args) {
		RunnableCounter rc1 = new RunnableCounter("A");
		RunnableCounter rc2 = new RunnableCounter("B");
		Thread th1 = new Thread(rc1);
		Thread th2 = new Thread(rc2);
		th1.start();
		th2.start();
	}
}
