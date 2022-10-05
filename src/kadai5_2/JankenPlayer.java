package kadai5_2;

abstract class JankenPlayer {
	String name;  // Playerの名前
	Hand hand;    // 現在の「手」(初期値はnull)

	JankenPlayer(String name) {
		this.name = name;
	}
	
	abstract Hand setNextHand();  // 次の手を決めhandに設定する

	boolean beats(JankenPlayer jp) {
		// 相手の手より自分の手が勝っていたらtrue
		return hand==Hand.ROCK && jp.hand==Hand.SCISSORS
				|| hand==Hand.SCISSORS && jp.hand==Hand.PAPER
				|| hand==Hand.PAPER && jp.hand==Hand.ROCK;
	}
	@Override
	public String toString() {
		return "[" + name + "]: " + hand.toString();
	}
}
