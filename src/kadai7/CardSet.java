package kadai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardSet {
	private List<Card> cards;

	CardSet(int maxnum) {
		// cardsは，1からmaxnumまでの各スートのカードとする

		cards = new ArrayList<Card>();
		for (Card.Suit suit : Card.Suit.values()) {
			// Suitの種類を変化させながらループする
			for (int num = 1; num <= maxnum; num++) {
				cards.add(new Card(suit, num));
			}
		}
	}

	public Card get(int index) {
		// index番目のカードを得る
		return cards.get(index);
	}

	public void display() {
		// 全カードを表示する
		for (Card c : cards)
			System.out.print(c.getLook() + " ");
		System.out.println();
	}

	public void shuffle() {
		// シャッフルする
		Collections.shuffle(cards);
	}
}
