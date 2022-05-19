package kadai2_1;

public class RunnableSquareTest {
	public static void main(String[] args) {
        RunnableSquare rsq1 = new RunnableSquare('+', 5);
        RunnableSquare rsq2 = new RunnableSquare('#', 7);
        RunnableSquare rsq3 = new RunnableSquare('!', 3);
        Thread t1 = new Thread(rsq1);
        Thread t2 = new Thread(rsq2);
        Thread t3 = new Thread(rsq3);
        t1.start();
        t2.start();
        t3.start();
    }
}
