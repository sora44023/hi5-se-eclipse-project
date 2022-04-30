package kadai1_4;

public class ColorControllerTest {
	public static void main(String[] args) {
		System.out.println();
        System.out.print("This ");
        ColorController.setColor(ColorController.Color.RED); // 文字色を赤に
        System.out.print("is ");
        ColorController.setColor(ColorController.Color.YELLOW, true);  // 背景色を黄に
        System.out.println("Test.");
        ColorController.setColor(ColorController.Color.WHITE, true); // 背景色を白に
        ColorController.setColor(ColorController.Color.BLUE); // 文字色を青に
        System.out.println("abc");
        ColorController.reset();  // 色のリセット
        System.out.println("def");
        ColorController.setColor(ColorController.Color.RED, true);
        ColorController.setColor(ColorController.Color.WHITE, false);
        System.out.println("ghi");
        System.out.println();
    }
}
