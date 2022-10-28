package kadai5_3_a;

import java.util.Random;

class MimicPlayer extends JankenPlayer {
	JankenPlayer jp;
	Hand target_hand;
	int count = 1;
	Random rnd = new Random();

	MimicPlayer(String name, JankenPlayer jp) {
		super(name);
		this.jp = jp;
	}

	@Override
	Hand setNextHand() {
		if (count == 1) {
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
		} else {
			hand = target_hand;
		}
		target_hand = jp.hand;
		count++;
		return hand;
	}

}
