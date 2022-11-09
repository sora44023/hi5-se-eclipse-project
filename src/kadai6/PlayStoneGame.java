package kadai6;

public class PlayStoneGame {
	public static void main(String[] args) {
		Game g = new Game(new ComputerPlayer("Alice"), new ComputerPlayer("Bob"));
		g.start();
	}

}
