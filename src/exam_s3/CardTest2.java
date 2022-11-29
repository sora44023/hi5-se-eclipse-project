package exam_s3;

import java.util.*;

public class CardTest2 {
	public static void main(String[] args) {
		Card c = new BoxCard();
		System.out.println(c);
		Scanner scan = new Scanner(System.in);
		while (true) {
			c.show();
			System.out.print("Number?: ");
			int num = scan.nextInt();
			c.hit(num);
			if(c.isBingo()) {
				c.show();
				System.out.println("Bingo!");
				break;
			}
		}
	}
}
