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
				setMode(in, g);
				continue;
			} else
				continue;
			g.start();

		}
		in.close();
	}

	private static void setMode(Scanner in, Game g) {
		System.out.print("管理者用パスワードを入力してください．> ");
		String s = in.next();
		if(!s.equals("password")) {
			System.out.println("[Error] パスワードが間違っています．設定モードを終了します．\n");
			return;
		}
		System.out.printf("石の見た目を設定してください (現在の設定: %c) > ", g.getStoneChar());
		s = in.next();
		char c = s.charAt(0);
		g.setStoneChar(c);
		System.out.printf("\n石の見た目を %c に設定しました．\n", g.getStoneChar());
		int n = 0;
		while (true) {
			System.out.printf("石の数(8,12,16,20)を設定してください (現在の設定: %d) > ", g.getFirstStone());
			try {
				n = in.nextInt();
				g.setFirstStone(n);
			} catch (InputMismatchException e) {
				System.out.println("[Error] 数値を入力してください．\n");
				in.next();
			}
			if (n == 8 || n == 12 || n == 16 || n == 20)
				break;
			System.out.println("[Error] 8,12,16,20のいずれかの数値を入力してください．初期値12に戻します．\n");
			g.setFirstStone(12);
			return;
		}
		System.out.printf("\n石の数を %d に設定しました．\n", g.getFirstStone());
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
		}
		System.out.println("設定を適用しました．\n");
	}

}
