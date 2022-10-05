package kadai5_2;

class JankenPlayerTest {
	public static void main(String[] args) {
		JankenPlayer jp = new SimplePlayer("Mike");
		for(int i=0; i<7; i++) {
			jp.setNextHand();
			System.out.println(jp.hand);
		}
	}
}
