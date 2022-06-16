package kadai3;

public class Main {
	
	final static int SHIFT_WIDTH = 32; // 出力の際の空白の幅
	
	public static void main(String[] args) {
		Lift lift1 = new Lift(2);
		Thread t1 = new Thread(lift1);
		t1.start();	
		Lift lift2 = new Lift(2);
		Thread t2 = new Thread(lift2);
		t2.start();		
	}
//	public synchronized static void show(String s, int shift) {
//		// shift分だけ空白をあけてsを出力する
//		for (int i=0; i<shift; i++)
//			System.out.print(' ');
//		System.out.println(s);
//	}
	public synchronized static void show(int no, int id, int currentFloor) {
		// shift分だけ空白をあけてsを出力する
		for (int i=0; i<(no - 1) * SHIFT_WIDTH; i++)
			System.out.print(' ');
		if(currentFloor==3) {
			System.out.println("Passenger " + id + ": Thanks!");
		}else {
			for(int i=0; i<currentFloor; i++) {
				System.out.print("----|");
			}
			System.out.printf("[%2d]\n",id);
		}
	}
}
