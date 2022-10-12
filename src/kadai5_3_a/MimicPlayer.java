package kadai5_3_a;

import java.util.Random;

class MimicPlayer extends JankenPlayer{
	JankenPlayer jp;
	Hand target_hand;
	Random rnd = new Random();

	MimicPlayer(String name, JankenPlayer jp) {
		super(name);
		// TODO Auto-generated constructor stub
		this.jp = jp;
	}

	@Override
	Hand setNextHand() {
		// TODO Auto-generated method stub
		if(jp.hand == null) {
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
			hand = jp.hand;
		}
		return hand;
	}
	
}
