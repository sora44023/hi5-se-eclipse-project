package kadai2_2;

public class BankTest {
	public static void main(String[] args) {
		int n = 100;
		BankAccount ba = new BankAccount(5000); // 対象口座は1つ、初期値5000円
		Client c[] = new Client[n];
		for (int i = 0; i < n; i++) {
			c[i] = new Client(ba, "user"+ Integer.toString(i));
		}

		Thread t[] = new Thread[n];
		for (int i = 0; i < n; i++) {
			t[i] = new Thread(c[i]);
		}

		for (int i = 0; i < n; i++) {
			t[i].start();
		}
	}
}
