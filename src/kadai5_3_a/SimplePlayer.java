package kadai5_3_a;

class SimplePlayer extends JankenPlayer {
    
	SimplePlayer(String name) {
		super(name);
	}
	
	public Hand setNextHand() {
		if(hand == null || hand == Hand.PAPER)
			hand = Hand.ROCK;
		else if(hand == Hand.ROCK)
			hand = Hand.SCISSORS;
		else if(hand == Hand.SCISSORS)
			hand = Hand.PAPER;
		return hand;
	}
}
