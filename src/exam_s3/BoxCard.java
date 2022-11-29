package exam_s3;

public class BoxCard extends Card {

	public BoxCard() {
		super();
	}

	@Override
	void show() {
		for (int i = 0; i < NUMLEN; i++) {
			if (nums[i] == FLAG_HIT)
				System.out.print("[*]");
			else
				System.out.print("[" + nums[i] + "]");
			if (i % 2 == 1)
				System.out.println();
		}
	}

	@Override
	boolean isBingo() {
		boolean height = false;
		boolean width = false;
		if (nums[0] == nums[2] || nums[1] == nums[3])
			height = true;
		if (nums[0] == nums[1] || nums[2] == nums[3])
			width = true;
		return (height || width);
	}

	@Override
	public String toString() {
		return "BoxCard";
	}

}
