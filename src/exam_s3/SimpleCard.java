package exam_s3;

public class SimpleCard extends Card {
	public SimpleCard() {
		super();
	}

	@Override
	void show() {
		for (int i = 0; i < NUMLEN; i++) {
			if (nums[i] == FLAG_HIT)
				System.out.print("[*]");
			else
				System.out.print("[" + (i+1) + "]");
		}
		System.out.println();
	}

	@Override
	boolean isBingo() {
		for (int i = 0; i < NUMLEN; i++) {
			if (nums[i] != FLAG_HIT)
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SimpleCard";
	}
}
