package kadai6;

public class Game {
	private int stoneCount = 12;
	private Player[] players;
	private static int gameCount = 0;

	public Game(Player p1, Player p2) {
		players = new Player[2];
		players[0] = p1;
		players[1] = p2;
		gameCount = getGameCount() + 1;
	}

	void printStone() {
		System.out.print("stone: ");
		for(int i=0; i<stoneCount; i++)
			System.out.print("@");
		System.out.println("[" + stoneCount + "]");
	}
	
	void start() {
		System.out.println("[Game No." + getGameCount() + "]");
		do {
			for (int i = 0; i < 1; i++) {
				stoneCount = players[i].takeStones(stoneCount);
				System.out.println(players[i].toString() + "took");
			}
		} while (stoneCount < 1);
	}

	public static int getGameCount() {
		return gameCount;
	}
}
