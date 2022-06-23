package kadai3;

public class Main {
	public static void main(String[] args) {
		Lift lift1 = new Lift(2);
		Thread t1 = new Thread(lift1);
		t1.start();	
		Lift lift2 = new Lift(3);
		Thread t2 = new Thread(lift2);
		t2.start();
		Lift lift3 = new Lift(4);
		Thread t3 = new Thread(lift3);
		t3.start();	
	}
	public synchronized static void show(String s, int shift) {
		// shift分だけ空白をあけてsを出力する
		for (int i=0; i<shift; i++)
			System.out.print(' ');
		System.out.println(s);
	}
}