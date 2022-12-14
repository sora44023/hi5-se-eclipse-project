package kadai7;

public class CardSet {
	private Card[] cards;

	CardSet(int maxnum) {
		// cardsは，1からmaxnumまでの各スートのカードとする
		cards = new Card[maxnum * 4];
		int i = 0;
		for (Card.Suit suit : Card.Suit.values()) {
			// Suitの種類を変化させながらループする
			for (int num = 1; num <= maxnum; num++) {
				cards[i] = new Card(suit, num);
				i++;
			}
		}
	}

	public Card get(int index) {
		// index番目のカードを得る
		return cards[index];
	}

	public void display() {
		// 全カードを表示する（未実装）
	}

	public void shuffle() {
		// シャッフルする（未実装）
	}
}
