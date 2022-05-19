package kadai2_2;

public class BankTest {
	public static void main(String[] args) {
        BankAccount ba = new BankAccount(5000); // 対象口座は1つ、初期値5000円
        Client c1 = new Client(ba, "Alice");
        Client c2 = new Client(ba, "Bob");
        Client c3 = new Client(ba, "Chris");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
    }
}
