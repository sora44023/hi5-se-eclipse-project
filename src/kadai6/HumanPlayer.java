package kadai6;

import java.util.InputMismatchException;
import java.util.Scanner;

class HumanPlayer extends Player {

	Scanner in = new Scanner(System.in);

	HumanPlayer(String name) {
		super(name);
	}
	// 必要なメソッドの実装

	@Override
	int takeStones(int stoneCount) {
		int n = 0;
		System.out.println("Enter values in the range 1 to 3");
		while (true) {
			System.out.print("Input number: ");
			try {
				n = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("[Error] 数値を入力してください．");
				in.next();
			}
			if (n >= 1 && n <= 3)
				break;
		}

		return stoneCount - n;
	}
}
