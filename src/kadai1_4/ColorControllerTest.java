package kadai1_4;

public class ColorControllerTest {
	public static void main(String[] args) {
		System.out.println();
        System.out.print("This ");
        ColorController.setColor(ColorController.Color.RED); // �����F��Ԃ�
        System.out.print("is ");
        ColorController.setColor(ColorController.Color.YELLOW, true);  // �w�i�F������
        System.out.println("Test.");
        ColorController.setColor(ColorController.Color.WHITE, true); // �w�i�F�𔒂�
        ColorController.setColor(ColorController.Color.BLUE); // �����F���
        System.out.println("abc");
        ColorController.reset();  // �F�̃��Z�b�g
        System.out.println("def");
        ColorController.setColor(ColorController.Color.RED, true);
        ColorController.setColor(ColorController.Color.WHITE, false);
        System.out.println("ghi");
        System.out.println();
    }
}
