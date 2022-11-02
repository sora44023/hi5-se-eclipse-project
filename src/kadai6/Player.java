package kadai6;

abstract class Player {
	private String name;	
	abstract int takeStones(int stoneCount);  // 石の数を受け取り，取った後に残った石の数を返す
	
	Player(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}
