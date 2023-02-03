package kadai7;

abstract class Player {
	private String name;
	private int sc;

	abstract int[] takeCard(CardSet cs);

	Player(String name) {
		this.name = name;
	}

	void successCount() {
		sc = getSc() + 1;
	}

	public int getSc() {
		return sc;
	}

	@Override
	public String toString() {
		return name;
	}
}
