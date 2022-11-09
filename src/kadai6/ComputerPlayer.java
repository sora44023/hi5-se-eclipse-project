package kadai6;

import java.util.Random;

class ComputerPlayer extends Player {
	
	Random rnd = new Random();
	
	ComputerPlayer(String name) {
		super(name);
	}

	@Override
	int takeStones(int stoneCount) {
		return stoneCount - (rnd.nextInt(3) + 1);
	}
}
