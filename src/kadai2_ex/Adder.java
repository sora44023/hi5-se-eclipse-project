package kadai2_ex;

public class Adder implements Runnable {
    SimpleBank bank;
    int val;
    
    Adder(SimpleBank sb, int val) {
        bank = sb;
        this.val = val;
    }
    @Override
    public void run() {
        for(int i=0; i<5; i++)
            bank.addValue(val);
    }
}
