package kadai2_ex;

public class AdderMultiTest {
    public static void main(String[] args) {
        SimpleBank sb = new SimpleBank();
        Adder a1 = new Adder(sb, 1);
        Adder a2 = new Adder(sb, 100);
        Thread th1 = new Thread(a1);
        Thread th2 = new Thread(a2);
        th1.start();
        th2.start();        
    }
}
