package kadai7;

import java.util.Random;

import kadai7.Card.CardState;

public class CPUPlayer extends Player {

	CPUPlayer(String name) {
		super(name);
	}

	@Override
	int[] takeCard(CardSet cs) {
		Random rnd = new Random();
		int[] num = new int[2];
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			while (true) {
				int rn = rnd.nextInt(cs.getLength());
				if (cs.get(rn).getState() == CardState.BACK) {
					num[i] = rn;
					break;
				}
			}
			cs.get(num[i]).flipUp();
			cs.display();
		}
		return num;
	}

}
