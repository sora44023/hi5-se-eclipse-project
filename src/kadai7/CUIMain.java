package kadai7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CUIMain {
	public static void main(String[] args) {
		Game g = new Game();
		GameSettings gs = new GameSettings();
		while (true) {
			System.out.println("<<< Stone Game >>>");
			System.out.println("[1] 対戦モード (CPU vs You)");
			System.out.println("[2] ネットワーク対戦モード");
			System.out.println("[3] 観戦モード (CPU1 vs CPU2)");
			System.out.println("[8] ゲームの設定");
			System.out.println("[9] Quit");
			int n = inputNumber();
			if (n == 1)
				g = new Game(new CPUPlayer("CPU1"), new HumanPlayer("You"), gs);
			if (n == 3)
				g = new Game(new CPUPlayer("CPU1"), new CPUPlayer("CPU2"), gs);
			if (n == 9) {
				System.out.println("bye.");
				break;
			}
			g.start();
		}
	}

	private static int inputNumber() {
		int x;
		Integer numl[] = { 1, 2, 3, 8, 9 };
		Scanner in = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Select mode: ");
				x = in.nextInt();
				if (Arrays.asList(numl).contains(x))
					break;
				System.out.println("[Error] 表示されている数字を入力してください．");
			} catch (InputMismatchException e) {
				System.out.println("[Error] 数字を入力してください．");
				in.next();
			}
		}
		return x;
	}
}
