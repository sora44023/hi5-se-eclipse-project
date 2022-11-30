package kadai6;

public class Game {
	private int firstStone = 12;
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
		int winnerNum = 0;
		do {
			for (int i = 0; i < 2; i++) {
				int ts = players[i].takeStones(stoneCount);
				if (ts < 0)
					break;
				System.out.println(players[i].toString() + " took " + (stoneCount - ts) + " stone(s).");
				stoneCount = ts;
				winnerNum = i;
				printStone();
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
				}
			}
		} while (stoneCount > 0);
		System.out.println(players[winnerNum] + " wins!");
	}

	public int getGameCount() {
		return gameCount;
	}

	public void setStoneChar(char sc) {
		stoneChar = sc;
	}

	public void setfirstStone(int fs) {
		firstStone = fs;
	}
}
