package kadai5_3_a;

public class JankenSimulator2 {
	public static void main(String[] args) {
		JankenPlayer[] jps = new JankenPlayer[2];
		jps[0] = new RandomPlayer("Bill");
		jps[1] = new MimicPlayer("Ben", jps[0]);
		int count = 1;
		do {
			for (int i = 0; i < 2; i++)
				jps[i].setNextHand();
			System.out.println("(" + count + ") " + jps[0] + "\tVS\t" + jps[1]);
			count++;
		} while (count != 11);

	}
}
