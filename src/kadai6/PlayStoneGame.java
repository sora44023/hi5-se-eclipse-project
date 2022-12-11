package kadai6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayStoneGame {
	public static void main(String[] args) {
		Game g = new Game();
		int n = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("<<< Stone Game >>>");
			System.out.println("[1] 対戦モード (Alice vs You)");
			System.out.println("[2] 対戦モード (StrongCPU vs You)");
			System.out.println("[3] 観戦モード (Alice vs Bob)");
			System.out.println("[8] ゲームの設定");
			System.out.println("[9] Quit");
			System.out.print("Select mode: ");
			g.setStoneChar('*');
			try {
				n = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("[Error] 数値を入力してください．");
				in.next();
			}
			if (n == 9) {
				System.out.println("bye.");
				break;
			}
			if (n == 1)
				g = new Game(new ComputerPlayer("Alice"), new HumanPlayer("You"));
			else if (n == 2)
				g = new Game(new StrongPlayer("StrongCPU"), new HumanPlayer("You"));
			else if (n == 3)
				g = new Game(new ComputerPlayer("Alice"), new ComputerPlayer("Bob"));
			else if (n == 8) {
				setMode();
				continue;
			} else
				continue;
			g.start();

		}
		in.close();
	}

	private static void setMode() {
		// TODO Auto-generated method stub

	}

}
