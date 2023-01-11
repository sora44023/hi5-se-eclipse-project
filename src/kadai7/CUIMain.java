package kadai7;

public class CUIMain {
	public static void main(String[] args) {
		CardSet cs = new CardSet(3);
		Player[] p = new Player[] { new CPUPlayer("CPU1"), new CPUPlayer("CPU2") };
		int nowPlayer = 0;
		cs.shuffle();
		while (cs.getLeftCount() != 0) {
			System.out.println("残り枚数: " + cs.getLeftCount());
			System.out.println(p[nowPlayer] + "'s turn.");
			cs.display(); // カード表示
			int[] tmp = new int[2];
			tmp = p[nowPlayer].takeCard(cs);
			for (int i = 0; i < 2; i++) {
				if (cs.get(tmp[0]).getNumber() == cs.get(tmp[1]).getNumber()) {
					cs.get(tmp[i]).take();
					p[nowPlayer].successCount();
				} else {
					cs.get(tmp[i]).flipDown();
				}
			}
			System.out.println();
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
			}
		}

		cs.display(); // カード表示
		System.out.println("Done!");
		for (int i = 0; i < 2; i++)
			System.out.println(p[i] + ": " + p[i].getSc());

	}
}
