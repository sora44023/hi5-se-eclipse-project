package exam_s3;

import java.util.Random;

public class DigitProvider {
	Random rnd = new Random();
	boolean nums[] = new boolean[9];

	DigitProvider() {
		for (int i = 0; i < nums.length; i++)
			nums[i] = true;	// 使用可能はtrue
	}
	
	boolean checkComplete() {
		for (int i = 0; i < nums.length; i++)
			if(nums[i]==true)
				return false;
		return true;		// 全て使用している場合はtrue
	}

	int getNext() {
		while (true) {
			int rn = rnd.nextInt(9);
			if (nums[rn]) {
				nums[rn] = false;
				return rn + 1;
			}
			if(checkComplete())
				return -1;
		}
	}
}
