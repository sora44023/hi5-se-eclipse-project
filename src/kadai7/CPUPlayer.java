package kadai7;

import java.util.Random;

import kadai7.Card.CardState;

public class CPUPlayer extends Player {

	CPUPlayer(String name) {
		super(name);
	}

	@Override
	int takeCard(CardSet cs) {
		Random rnd = new Random();
		while (true) {
			int rn = rnd.nextInt(12);
			if (cs.get(rn).getState() == CardState.BACK)
				return rn;
		}
	}

}
