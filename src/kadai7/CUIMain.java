package kadai7;

public class CUIMain {
	public static void main(String[] args) {
		CardSet cs = new CardSet(3);
		Player p = new CPUPlayer("CPU1");
		cs.shuffle();
		while (cs.getLeftCount() != 0) {
			System.out.println("残り枚数: " + cs.getLeftCount());
			cs.display(); // カード表示
			int[] tmp = new int[2];
			tmp = p.takeCard(cs);
			// 数字が同じだった場合
			if (cs.get(tmp[0]).getNumber() == cs.get(tmp[1]).getNumber())
				for (int i = 0; i < 2; i++)
					cs.get(tmp[i]).take();
			// 数字が異なる場合
			else
				for (int i = 0; i < 2; i++)
					cs.get(tmp[i]).flipDown();
			System.out.println();
		}
		cs.display(); // カード表示
	}
}
