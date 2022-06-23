package kadai3;

public class PassengerCounter {
	private static final int PASSENGER_NUM = 10; // 乗客の総人数
	static private int count = 0; // 乗客番号のカウント用

	synchronized public static int getNextPassengerId() {
		// 次の乗客番号を取得する．次がいなければ負の値を返す
		if (count >= PASSENGER_NUM) {
			return -1;
		} else {
			count++;
			return count;
		}
	}
}
