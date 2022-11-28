package implexam_s3;

public class RotatableShapeTest {
	public static void main(String[] args) {
		RotatableShape[] shapes = new RotatableShape[2];
		shapes[0] = new RotatableLine(3);
		shapes[1] = new RotatableRectangle(2, 4);
		
		for(int i=0; i<2; i++) {
			System.out.println("# shape No." + i);
			shapes[i].draw();
			shapes[i].rotate();
			System.out.println("rotate");
			shapes[i].draw();
			shapes[i].rotate();
			System.out.println("rotate");
			shapes[i].draw();
		}
	}
}
