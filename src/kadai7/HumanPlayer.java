package kadai7;

import java.util.InputMismatchException;
import java.util.Scanner;

import kadai7.Card.CardState;

public class HumanPlayer extends Player {

	HumanPlayer(String name) {
		super(name);
	}

	@Override
	int[] takeCard(CardSet cs) {
		int[] num = new int[2];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			int x;
			while (true) {
				try {
					System.out.print("Input number: ");
					x = in.nextInt();
					cs.get(x);
					if (cs.get(x).getState() == CardState.BACK)
						break;
					System.out.println("[Error] 裏向きのカードを選択してください．");
				} catch (IndexOutOfBoundsException e) {
					System.out.println("[Error] 範囲内の数値を入力してください．");
				} catch (InputMismatchException e) {
					System.out.println("[Error] 数値を入力してください．");
					in.next();
				}
			}
			num[i] = x;
			cs.get(num[i]).flipUp();
			cs.display();
		}
		return num;
	}
}
