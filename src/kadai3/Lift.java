package kadai3;

public class Lift implements Runnable {
	private int psgnum; // 乗せている乗客番号．乗せていなければ負の値
	private int delay; // 遅さ（1動作の間隔）

	private static int seqNo = 1; // 通し番号
	private int no = 0; // リフト番号
	private int floor = 4;

	final static int SHIFT_WIDTH = 32; // 出力の際の空白の幅

	public Lift(int delay) {
		this.delay = delay;
		psgnum = -1;
		no = seqNo;
		seqNo++;
	}

	private void print(String s) {
		try {
			Main.show(s, (no - 1) * SHIFT_WIDTH);
			Thread.sleep(delay * 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void goUpstairs(int id, int floor) {
		String s = "[" + String.format("%2d", id) + "]";
	}

	private void goDownstairs(int id) {
		String s = "[  ]";
		for (int i = 0; i <= floor; i++) {
			print("Lift" + no + ": " + s);
			s = "----|" + s;
		}
		print("Passenger " + id + ": Thanks!");
	}

	@Override
	public void run() {
		while (true) {
			int id = PassengerCounter.getNextPassengerId();
			if (id < 0)
				break;
			print("Lift" + no + ": Welcome Passenger No." + id);
			goUpstairs(id);
		}
	}
}