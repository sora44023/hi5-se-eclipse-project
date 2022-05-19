package kadai2_1;

public class SquareTest {
	public static void main(String[] args) {
        Square sq1 = new Square('+', 5);
        Square sq2 = new Square('#', 7);
        Square sq3 = new Square('!', 3);
        sq1.draw();
        sq2.draw();
        sq3.draw();
    }
}
