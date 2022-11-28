package implexam_s3;

public class RotatableRectangle extends RotatableShape{
	private int height;
	private int width;
	
	RotatableRectangle(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	@Override
	void draw() {
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	@Override
	void rotate() {
		int temp = width;
		width = height;
		height = temp;
	}
}
