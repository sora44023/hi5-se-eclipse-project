package kadai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kadai7.Card.CardState;

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
	
	public int getLength() {
		return cards.size();
	}

	public void display() {
		// 全カードを表示する
		for (int i = 0; i < cards.size(); i++)
			System.out.print(i + ":"+ cards.get(i).getLook() + " ");
		System.out.println();
	}

	public void shuffle() {
		// シャッフルする
		Collections.shuffle(cards);
	}

	public int getLeftCount() {
		int cnt = 0;
		for (Card c : cards)
			if (c.getState() != CardState.TAKEN)
				cnt++;
		return cnt;
	}
}
