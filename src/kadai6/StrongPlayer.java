package kadai6;

class StrongPlayer extends Player{
	private static int prevStone = -1;

	StrongPlayer(String name) {
		super(name);
	}

	@Override
	int takeStones(int stoneCount) {
		if(prevStone == -1) {
			prevStone = stoneCount - 3;
			return prevStone;
		}
		if(stoneCount <= 3)
			return 0;
		int sc = 4 - (prevStone - stoneCount);
		prevStone = stoneCount - sc;
		return prevStone;
	}
}
