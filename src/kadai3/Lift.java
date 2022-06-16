package kadai3;

public class Lift implements Runnable {
	private int psgnum; // 乗せている乗客番号．乗せていなければ負の値
	private int delay; // 遅さ（1動作の間隔）

	private static int seqNo = 1; // 通し番号
	private int no = 0; // リフト番号

	final static int SHIFT_WIDTH = 32; // 出力の際の空白の幅

	public Lift(int delay) {
		this.delay = delay;
		psgnum = -1;
		no = seqNo;
		seqNo++;
	}

	@Override
	public void run() {
		try {
			while (true) {
				int id = PassengerCounter.getNextPassengerId();
				if (id < 0)
					break;
				Main.show("Lift" + no + ": Welcome Passenger No." + id, (no - 1) * SHIFT_WIDTH);
				String s = "[" + String.format("%2d", id) + "]";
				for (int i = 0; i < 5; i++) {
					Main.show("Lift" + no + ": " + s, (no - 1) * SHIFT_WIDTH);
					s = "----|" + s;
				}
				Main.show("Passenger " + id + ": Thanks!", (no - 1) * SHIFT_WIDTH);
				for (int i = 0; i < 5; i++) {
					Main.show("Lift" + no + ": " + s, (no - 1) * SHIFT_WIDTH);
				}
				Thread.sleep(delay * 100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}