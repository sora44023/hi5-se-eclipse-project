package kadai2_ex;

public class SimpleBank {
    private int value = 0;
    
    synchronized void addValue(int v) {
        System.out.print("[");
        value = value + v;
        System.out.println(value + "]");
    }
}
