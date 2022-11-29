package exam_s3;

abstract class Card {
	int nums[]; // ナンバーのデータ
	public static int NUMLEN = 4; // データの長さ（ナンバーの数）
	public static int FLAG_HIT = -1; // 当たった状態
	DigitProvider dp;

	Card() {
		nums = new int[NUMLEN]; // NUMLEN個の配列の実体を生成する
		dp = new DigitProvider();
		for (int i = 0; i < NUMLEN; i++)
//			nums[i] = i + 1;
			nums[i] = dp.getNext();
	}

	void hit(int num) { // 番号numを当たりにする
		for (int i = 0; i < NUMLEN; i++)
			if (nums[i] == num)
				nums[i] = FLAG_HIT;
	}

	abstract void show(); // 現在の状態を表示する

	abstract boolean isBingo(); // ビンゴが成立しているかどうか
}
