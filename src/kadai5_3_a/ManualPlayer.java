package kadai5_3_a;

import java.util.Scanner;

class ManualPlayer extends JankenPlayer {
	Scanner in = new Scanner(System.in);
	ManualPlayer(String name) {
		super(name);
	}
	
	public Hand setNextHand() {
	    System.out.println("0: Rock\n1: Scissors\n2: Paper");
	    System.out.print("input: ");
	    int x = in.nextInt();
	    switch (x) {
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
