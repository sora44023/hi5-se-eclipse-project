package implexam3_prac;

public class RotatableLine extends RotatableShape {
	private int len;
	private boolean vertical = false;

	RotatableLine(int len) {
		 this.len = len;
	}
	
	@Override
	void draw() {
		for(int i=0; i<len; i++) {
			System.out.print('*');
			if (vertical || i == len - 1)
				System.out.println(); // 改行
		}
	}

	@Override
	void rotate() {
		vertical = !vertical;
	}
}
