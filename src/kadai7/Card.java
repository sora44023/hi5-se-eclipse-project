package kadai7;

public class Card {
	enum Suit {
		SPADE, HEART, DIAMOND, CLUB
	}

	enum CardState {
		FRONT, BACK, TAKEN
	} // カードの状態: 表向き(FRONT)，裏向き(BACK)，取られている(TAKEN)

	private Suit suit; // スート
	private int number; // 番号
	private CardState state; // カードの状態

	Card(Suit suit, int number) {
		this.suit = suit;
		this.number = number;
		this.state = CardState.BACK;
	}

	public Suit getSuit() {
		return suit;
	}

	public int getNumber() {
		return number;
	}

	public CardState getState() {
		return state;
	}

	public void take() {
		// カードを「取る」
		this.state = CardState.TAKEN;
	}

	public void flipUp() {
		// カードを表にする．もしカードがすでに取られていれば何もしない．
		if (state != CardState.TAKEN)
			state = CardState.FRONT;
	}

	public void flipDown() {
		// カードを裏にする．もしカードがすでに取られていれば何もしない．
		if (state != CardState.TAKEN)
			state = CardState.BACK;
	}

	public String getLook() {
		// 状態(state)に応じて，カードの見た目の文字列を返す
		if (state == CardState.BACK) // 裏向き
			return "[###]";
		else if (state == CardState.TAKEN) // 取られている
			return " --- ";
		else
			return this.toString();
	}

	@Override
	public String toString() {
		char suitid = suit.name().charAt(0); // suitの先頭文字(例えばsuitがSPADEなら'S')を取得する。
		String spacing = number < 10 ? " " : ""; // suit idとnumber間の空白（三項演算子）
		return "[" + suitid + spacing + number + "]";
	}
}
