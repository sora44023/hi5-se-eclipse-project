package kadai7;

public class CardSetTest {
	public static void main(String[] args) {
		CardSet cs = new CardSet(3); // 各スートの1から3までのカードセット(12枚)を作成
		System.out.println("初期状態:");
		cs.display(); // カード表示
		cs.get(2).flipUp(); // 2番目のカードを表にする
		cs.get(5).flipUp(); // 5番目のカードを表にする
		System.out.println("2枚カードをめくった後:");
		cs.display();
		cs.get(0).take(); // 0番目のカードを取る
		System.out.println("1枚カードを取った後:");
		cs.display();
	}
}
