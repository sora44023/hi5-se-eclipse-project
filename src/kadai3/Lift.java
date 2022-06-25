package kadai3;

public class Lift implements Runnable {
	private int delay; // 遅さ（1動作の間隔）

	private static int seqNo = 1; // 通し番号
	private int no = 0; // リフト番号
	private String s;
	final static int FLOOR = 4;
	final static int SHIFT_WIDTH = 32; // 出力の際の空白の幅

	public Lift(int delay) {
		this.delay = delay;
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

	private void move(int id) {
		String n = String.format("%2d", id);
		s = "[" + n + "]";
		// 上の階へ
		print("Lift" + no + ": Welcome Passenger No." + id);
		for (int i = 0; i < FLOOR; i++) {
			print("Lift" + no + ": " + s);
			s = "----|" + s;
		}
		print("Passenger " + id + ": Thanks!");
		
		// 下の階へ
		s = s.replace("[" + n + "]", "[  ]"); // リフトの中身を視覚的に空に
		for (int i = 1; i <= FLOOR; i++) {
			print("Lift" + no + ": " + s.substring(i * 5, s.length()));
		}
	}

	@Override
	public void run() {
		while (true) {
			int id = PassengerCounter.getNextPassengerId();
			if (id < 0)
				break;
			move(id);
		}
		print("Lift" + no + " has stopped.");
	}
}