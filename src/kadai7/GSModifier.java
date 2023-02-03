package kadai7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GSModifier {
	private GameSettings gs;
	private Scanner in = new Scanner(System.in);

	public GSModifier(GameSettings gs) {
		this.gs = gs;
	}

	public void setupMode() {
		int n;
		if (!auth())
			return;
		System.out.println("カードセットの現在の設定値   : " + gs.getSuitMax());
		while (true) {
			System.out.print("カードセットの値を入力(1-13) : ");
			try {
				n = in.nextInt();
				if (0 < n && n < 14)
					break;
				System.out.println("[Error] 範囲内の数値を入力してください．");
			} catch (InputMismatchException e) {
				System.out.println("[Error] 数値を入力してください．");
				in.next();
			}
		}
		gs.setSuitMax(n);
	}

	private boolean auth() {
		System.out.print("管理者用パスワードを入力してください :");
		String s = in.next();
		if (s.equals("password"))
			return true;
		else {
			System.out.println("[Error] パスワードが間違っています．設定モードを終了します．\n");
			return false;
		}
	}
	
	public GameSettings getGS() {
		return gs;
	}
}
