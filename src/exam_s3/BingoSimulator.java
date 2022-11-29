package exam_s3;

public class BingoSimulator {
	public static void main(String[] args) {
		Card sc = new SimpleCard();
		DigitProvider dp1 = new DigitProvider();
		onePlay(sc, dp1);
		System.out.println();
		
		Card bc = new BoxCard();
		DigitProvider dp2 = new DigitProvider();
		onePlay(bc, dp2);

	}

	private static void onePlay(Card c, DigitProvider dp) {
		System.out.println(c);
		while (true) {
			c.show();
			int num = dp.getNext();
			System.out.println("Hit: " + num);
			c.hit(num);
			if (c.isBingo()) {
				c.show();
				System.out.println("Bingo!");
				break;
			}
		}
	}
}
