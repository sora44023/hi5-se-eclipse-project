package kadai6;

import java.util.Random;

class ComputerPlayer extends Player {
	
	Random rnd = new Random();
	
	ComputerPlayer(String name) {
		super(name);
	}

	@Override
	int takeStones(int stoneCount) {
		if(stoneCount < 3)
			return stoneCount - (rnd.nextInt(1) + 1);
		else
			return stoneCount - (rnd.nextInt(3) + 1);
	}
}
