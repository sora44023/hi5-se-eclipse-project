package kadai5_2;

public class JankenSimulator2 {
	public static void main(String[] args) {
		JankenPlayer[] jps = { new ManualPlayer("Bill"), new RandomPlayer("Ben") };
		int count = 1;
		do {
			for (int i = 0; i < 2; i++)
				jps[i].setNextHand();
			System.out.println("(" + count + ") " + jps[0] + "\tVS\t" + jps[1]);
			count++;
		} while (jps[0].hand == jps[1].hand);
		JankenPlayer winner;
		if (jps[0].beats(jps[1]))
			winner = jps[0];
		else
			winner = jps[1];
		System.out.println(winner.name + " wins!");
	}
}
