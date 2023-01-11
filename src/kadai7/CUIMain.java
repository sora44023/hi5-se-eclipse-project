package kadai7;

public class CUIMain {
	public static void main(String[] args) {
		CardSet cs = new CardSet(3);
		Player p = new CPUPlayer("CPU1");
		cs.shuffle();
		while (cs.getLeftCount() != 0) {
			System.out.println("残り枚数: " + cs.getLeftCount());
			cs.display(); // カード表示
			cs.get..takeCard(cs);
		}
	}
}
