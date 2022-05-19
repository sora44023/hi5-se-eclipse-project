package kadai2_2;

public class Client implements Runnable {
    private BankAccount account;
    private String name;

    Client(BankAccount ba, String name) {
        account = ba;
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            account.withdraw(1000, name); // 1000円引き出し
            account.deposit(1000, name);  // 1000円預金
        }
    }
}
