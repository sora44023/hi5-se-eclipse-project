package kadai7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {
	private CardSet cs;
	private List<Player> players = new ArrayList<>();
	private Iterator<Player> it;
	private Player nowPlayer;

	public Game() {
		
	}
	
	public Game(Player p1, Player p2, GameSettings gs) {
		cs = new CardSet(gs.getSuitMax());
		players.add(p1);
		players.add(p2);
		it = players.iterator();
		nowPlayer = it.next();
	}

	void start() {
		int[] tmp = new int[2];
		cs.shuffle();
		while (cs.getLeftCount() != 0) {
			System.out.println("残り枚数: " + cs.getLeftCount());
			System.out.println(nowPlayer + "'s turn.");
			cs.display();
			tmp = nowPlayer.takeCard(cs);
			if (cs.get(tmp[0]).getNumber() == cs.get(tmp[1]).getNumber()) {
				cs.get(tmp[0]).take();
				cs.get(tmp[1]).take();
				nowPlayer.successCount();
			} else {
				cs.get(tmp[0]).flipDown();
				cs.get(tmp[1]).flipDown();
				if (!it.hasNext())
					it = players.iterator();
				nowPlayer = it.next();
			}
			System.out.println();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		cs.display();
		System.out.println("Done!");
		for (Player p : players)
			System.out.println(p + ": " + p.getSc());
	}
}
