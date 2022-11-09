package kadai6;

import java.util.Scanner;

class HumanPlayer extends Player {
	
	Scanner in = new Scanner(System.in);
	
	HumanPlayer(String name) {
		super(name);
	}	
    // 必要なメソッドの実装

	@Override
	int takeStones(int stoneCount) {
		System.out.println("Enter values in the range 1 to 3");
	    System.out.print("input: ");
	    // TODO 範囲外の入力に対して再入力させる
		int n = in.nextInt();
		return stoneCount - n;
	}
}
