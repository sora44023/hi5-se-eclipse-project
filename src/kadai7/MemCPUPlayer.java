package kadai7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import kadai7.Card.CardState;

public class MemCPUPlayer extends Player {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	MemCPUPlayer(String name) {
		super(name);
	}

	@Override
	int[] takeCards(CardSet cs) {
		int[] num = new int[2];
		boolean match = false;
		if (map.size() == 0) {
			for (int i = 0; i < 2; i++) {
				sleep();
				num[i] = getBackCardIndex(cs);
				map.put(num[i], cs.get(num[i]).getNumber());
				cs.get(num[i]).flipUp();
				cs.display();
			}
		} else {
			sleep();
			num[0] = getBackCardIndex(cs);
			cs.get(num[0]).flipUp();
			cs.display();
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if(num[0] != entry.getKey() && cs.get(num[0]).getNumber() == entry.getValue() && cs.get(entry.getKey()).getState() == CardState.BACK) {
					num[1] = entry.getKey();
					map.remove(entry.getKey());
					match = true;
					break;
				}
			}
			if(!match) {
				map.put(num[0], cs.get(num[0]).getNumber());
				num[1] = getBackCardIndex(cs);
				map.put(num[1], cs.get(num[1]).getNumber());
			}
			sleep();
			cs.get(num[1]).flipUp();
			cs.display();
			match = false;
		}
		return num;
	}

	private int getBackCardIndex(CardSet cs) {
		Random rnd = new Random();
		while (true) {
			int rn = rnd.nextInt(cs.getLength());
			if (cs.get(rn).getState() == CardState.BACK)
				return rn;
		}
	}

	private void sleep() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
	}

}
