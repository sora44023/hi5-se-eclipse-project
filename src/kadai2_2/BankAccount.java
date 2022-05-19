package kadai2_2;

import java.util.Random;

public class BankAccount {
    private int balance; // 残高
    private Random rnd = new Random();

    public BankAccount(int initBalance) {
        balance = initBalance;
    }
    private void pause() {
        // ランダムの時間 (最大500ms)待つ
        try {
            Thread.sleep(rnd.nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void deposit(int val, String name) {
        // 預金の処理（わざと冗長な書き方をしている）
        System.out.println(name + ": " + val + "円 預金");
        int b = balance;
        pause(); // ここでちょっと待つ
        b = b + val;
        balance = b;
        printBalance();  // 残高出力
    }
    synchronized public void withdraw(int val, String name) {
        // 引き出しの処理（わざと冗長な書き方をしている）
        System.out.println(name + ": " + val + "円 引き出し");
        int b = balance;
        b = b - val;
        balance = b;
        printBalance(); // 残高出力
    }
    public void printBalance() {
        System.out.println("残高: " + balance + "円");
    }
}
