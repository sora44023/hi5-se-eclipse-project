package kadai2_ex;

public class AdderSingleTest {
	public static void main(String[] args) {
        SimpleBank sb = new SimpleBank();
        Adder a1 = new Adder(sb, 1);
        Adder a2 = new Adder(sb, 100);
        a1.run();  // 注意: startではない(並行処理ではない)
        a2.run();  // 注意: startではない(並行処理ではない)
    }
}
