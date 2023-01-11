package kadai7;

abstract class Player {
	private String name;

	abstract int[] takeCard(CardSet cs);

	Player(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
