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
	
	void start() {
		
	}

	public static int getGameCount() {
		return gameCount;
	}
}
