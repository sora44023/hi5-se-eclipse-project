package kadai6;

public class Game {
	private static int firstStone = 12;
	private int stoneCount = 0;
	private Player[] players;
	private static int gameCount = 0;
	private static char stoneChar = '@';

	public Game() {
		// 石の数や見た目の設定時に使用
	}

	public Game(Player p1, Player p2) {
		players = new Player[2];
		players[0] = p1;
		players[1] = p2;
		gameCount = getGameCount() + 1;
		stoneCount = firstStone;
	}

	void printStone() {
		System.out.print("stone: ");
		for (int i = 0; i < stoneCount; i++)
			System.out.print(stoneChar);
		System.out.println("[" + stoneCount + "]\n");
	}

	void start() {
		System.out.println("[ Game No." + getGameCount() + " ]");
		printStone();
		int i = 0;
		while (true) {
			int nextStone = players[i].takeStones(stoneCount);
			System.out.println(players[i].toString() + " took " + (stoneCount - nextStone) + " stone(s).");
			stoneCount = nextStone;
			printStone();
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
			}
			if (stoneCount <= 0)
				break;
			if (i == 0)
				i = 1;
			else if (i == 1)
				i = 0;
		}
		System.out.println(players[i] + " wins!");
	}

	public int getGameCount() {
		return gameCount;
	}

	public char getStoneChar() {
		return stoneChar;
	}

	public int getFirstStone() {
		return firstStone;
	}

	public void setStoneChar(char sc) {
		stoneChar = sc;
	}

	public void setFirstStone(int fs) {
		firstStone = fs;
	}
}
