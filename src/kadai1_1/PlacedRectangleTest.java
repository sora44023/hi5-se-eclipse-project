package kadai1_1;

public class PlacedRectangleTest {
	public static void main(String[] args) {
		PlacedRectangle pr1 = new PlacedRectangle();
		PlacedRectangle pr2 = new PlacedRectangle(123,45);
		PlacedRectangle pr3 = new PlacedRectangle(12,34,123,45);
		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println(pr3);
	}
}