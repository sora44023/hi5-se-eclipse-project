package kadai5_2;

import java.util.Random;

class RandomPlayer extends JankenPlayer {
	Random rnd = new Random();

	RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Hand setNextHand() {
		switch (rnd.nextInt(3)) {
		case 0:
			hand = Hand.ROCK;
			break;
		case 1:
			hand = Hand.SCISSORS;
			break;
		case 2:
			hand = Hand.PAPER;
			break;
		}
		return hand;
	}

}
